package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.LuckyHandler;
import model.Person;

public class Home extends JFrame {

  public Home() {

    JPanel panel = new JPanel();

    JLabel lblName = new JLabel("Name: ");
    panel.add(lblName);

    JTextField txtName = new JTextField(10);
    panel.add(txtName);

    JLabel lblLuckyNumber = new JLabel("Lucky Number: ");
    panel.add(lblLuckyNumber);

    JTextField txtLuckyNumber = new JTextField(2);
    panel.add(txtLuckyNumber);

    JButton btnSubmit = new JButton("Submit");
    btnSubmit.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // read name and lucky number
        // submit to backend to process
        Person p = new Person(txtName.getText(), Integer.valueOf(txtLuckyNumber.getText()).intValue());
        LuckyHandler handler = new LuckyHandler();
        boolean winner = handler.checkIfWinner(p);
        System.out.println("Is it a winner: " + winner);
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
