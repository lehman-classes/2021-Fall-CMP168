package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.LuckyHandler;
import model.Person;

public class Home extends JFrame {

  boolean isNameValid = false;
  boolean isNumberValid = false;

  // GridBagLayout

  public Home() {

    JPanel panel = new JPanel();

    JLabel lblName = new JLabel("Name: ");
    panel.add(lblName);

    JTextField txtName = new JTextField(10);
    txtName.setInputVerifier(new InputVerifier() {
      @Override
      public boolean verify(JComponent input) {
        JTextField txt = (JTextField) input;
        isNameValid = (txt.getText().length() > 0);
        return isNameValid;
      }
    });

    panel.add(txtName);

    JLabel lblLuckyNumber = new JLabel("Lucky Number: ");
    panel.add(lblLuckyNumber);

    JTextField txtLuckyNumber = new JTextField(2);
    txtLuckyNumber.setInputVerifier(new InputVerifier() {
      @Override
      public boolean verify(JComponent input) {
        JTextField txt = (JTextField) input;
        String number = txt.getText();
        isNumberValid = number.length() > 0;
        for (int i = 0; i < number.length(); i++) {
          char c = number.charAt(i);
          if (!Character.isDigit(c)) {
            // not a number
            isNumberValid = false;
            break;
          }
        }
        return isNumberValid;
      }
    });
    panel.add(txtLuckyNumber);

    JButton btnSubmit = new JButton("Submit");

    btnSubmit.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {

        if (isNameValid && isNumberValid) {
          String name = txtName.getText();
          int luckyNumber = Integer.parseInt(txtLuckyNumber.getText());
          // submit to backend to process
          Person p = new Person(name, luckyNumber);
          LuckyHandler handler = new LuckyHandler();
          boolean winner = handler.checkIfWinner(p);
          System.out.println("the lucky number is " + luckyNumber);
          System.out.println("Is it a winner: " + winner);
        }
        
      }

    });
    panel.add(btnSubmit);

    Component[] components = panel.getComponents();
    System.out.println("How many components: " + components.length);

    add(panel);

    setBackground(Color.CYAN);
    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}
