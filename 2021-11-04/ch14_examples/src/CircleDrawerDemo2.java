
import java.awt.Color;
import javax.swing.JPanel;

//Separate classes in 2 java files
//CircleDrawerAdapter extends MouseAdapter 

public class CircleDrawerDemo2 extends JPanel {

  public CircleDrawerDemo2() {
    addMouseListener(new CircleDrawerAdapter());
  }

  // inner class
}
