import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MyJFrame extends JFrame {
  public MyJFrame() {
    JPanel jp = new CircleDrawerDemo2();
    // JPanel jp = new JPanel(); // create a JPanel to hold other components
    // JButton jb = new JButton("My Button"); // construct a JButton with a String
    // on its face
    // JTextField tf = new JTextField();// construct a TextField

    // jp.setLayout(new BorderLayout());
    // jp.setBackground(Color.YELLOW); // sets the background color of the Jpanel
    // jp.setBorder(BorderFactory.createLineBorder(Color.BLUE));// adds blue border
    // to panel
    // tf.setText("some default text"); // sets the starting text of the TextField

    // jp.add(tf); // add the JTextField component to the JPanel component
    // jp.add(jb, BorderLayout.SOUTH); // add the JButton component to the JPanel
    // component

    add(jp); // adds the JPanel to its parent container (to a JFrame for example)

    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}