
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FlowLayoutDemo extends JFrame {

  private JButton[] jbs = new JButton[5];

  public FlowLayoutDemo() {

    JPanel jp = new JPanel();
    for (int i = 0; i < 5; i++) {
      int index = i + 1;
      jbs[i] = new JButton("  button" + index + "  ");
      // put code here to attach event handler to button
      jp.add(jbs[i]); // add button to jpanel
    }
    add(jp); // add panel containing buttons to jframe

    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}
