
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BoxLayoutDemo extends JPanel {

  private BoxLayout layout;
  private JButton topButton, middleButton, bottomButton;

  public BoxLayoutDemo() {
    // layout = new BoxLayout(this, BoxLayout.X_AXIS);
    layout = new BoxLayout(this, BoxLayout.Y_AXIS);
    setLayout(layout);
    JLabel label = new JLabel("Using BoxLayout");
    topButton = new JButton("Top");
    middleButton = new JButton("Middle");
    bottomButton = new JButton("Bottom");
    add(label);
    add(topButton);
    add(middleButton);
    add(bottomButton);
    setBackground(Color.white);

    setVisible(true);
    setSize(400, 400);
    // setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}
