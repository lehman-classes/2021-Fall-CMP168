import java.util.Scanner;

public class App {

  public static void isThree(int b) {
    if (b == 3) {
      System.out.println("b is 3");
    }
  }
  public static void main(String[] args) throws Exception {

    int a = 12;
    int b = 13;

    if (a == 12) {
      System.out.println("a is 12");
      if (a < 5) {
        System.out.println("It's less than 5");
        if (a < b) {
          System.out.println("It's less than b");
        }
      }
    }
    isThree(b);
  }

}
