package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class HomeFrame extends JFrame {

  public HomeFrame() {
    System.out.println("HomeFrame constructor");
    JPanel panel = new JPanel();
    JLabel label = new JLabel();

    label.setText("Hello, world!");
    panel.add(label);

    setupPanel(panel);
    setupFrame(panel);
  }

  private void setupPanel(JPanel panel) {
    panel.setBackground(Color.BLUE);

  }

  private void setupFrame(JPanel panel) {
    add(panel);
    setTitle("Our First GUI App");
    setSize(600, 600);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
