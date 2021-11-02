package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class HomeWindow extends JWindow {

  public HomeWindow() {

    JPanel panel = new JPanel();
    JButton button = new JButton();
    button.setText("Go");
    panel.add(button);

    add(panel);
    setSize(400, 400);
    setVisible(true);
    // setDefaultCloseOperation()
  }
}
