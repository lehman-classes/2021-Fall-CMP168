import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CircleDrawerAdapter extends MouseAdapter {
  private Color shapeColor = Color.BLUE;
  private int drawingSize = 20;
  private int lastX = 0, lastY = 0;
  private int x, y = 0;

  @Override
  public void mousePressed(MouseEvent e) {
    lastX = e.getX();
    lastY = e.getY();
    Graphics g = e.getComponent().getGraphics();
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(shapeColor);
    g2d.fillOval(lastX - drawingSize, lastY - drawingSize, 2 * drawingSize, 2 * drawingSize);
  }
}
