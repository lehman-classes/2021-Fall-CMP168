
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GridLayoutDemo extends JFrame {
  private JButton[] jbs = new JButton[6];

  public GridLayoutDemo() {
    JPanel jp = new JPanel();
    jp.setLayout(new GridLayout(3, 2));
    jp.setBackground(Color.WHITE);
    for (int i = 0; i < 6; i++) {
      int index = i + 1;
      jbs[i] = new JButton("  button" + index + "  ");
      // put code here to attach event handler to button
      jp.add(jbs[i]); // add button to jpanel
    }
    add(jp);

    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}
