import javax.swing.*;

import view.HomeFrame;
import view.HomeWindow;

public class App {
  public static void main(String[] args) throws Exception {

    System.out.println("From main program: " + Thread.currentThread().getId());

    // call GUI here
    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {
        System.out.println("From Runnable: " + Thread.currentThread().getId());
        HomeFrame home = new HomeFrame();
        // HomeWindow window = new HomeWindow();

      }
    });

    System.out.println("From main program: " + Thread.currentThread().getId());
  }
}
