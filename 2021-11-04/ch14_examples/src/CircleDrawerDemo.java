
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
//Event Handlng in 1 java file using Interface

public class CircleDrawerDemo extends JPanel implements MouseListener {

  private Color shapeColor = Color.BLUE;
  private int drawingSize = 20;
  private int lastX = 0, lastY = 0;

  public CircleDrawerDemo() {
    addMouseListener(this);
  }

  @Override
  public void mouseClicked(MouseEvent e) {
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  @Override
  public void mousePressed(MouseEvent e) {
    lastX = e.getX();
    lastY = e.getY();
    Graphics g = getGraphics();
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(shapeColor);
    // g2d.fillOval(lastX, lastY, drawingSize, drawingSize);
    // compare the line of code above with the one below
    g2d.fillOval(lastX - drawingSize, lastY - drawingSize, 2 * drawingSize, 2 * drawingSize);
  }

}
