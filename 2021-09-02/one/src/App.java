import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    // int numCookies = 3;
    // while (numCookies > 0) {
    // System.out.println("Yummy");
    // numCookies--;
    // }

    // do {
    // System.out.println("Eat cookies");
    // numCookies--;
    // } while (numCookies > 0);

    // for (int numCookies = 2; numCookies > 0; numCookies--) {
    // System.out.println("Yummy");
    // }

    // for (int cookieNum = 0; cookieNum < 5; cookieNum++) {
    // System.out.print("inside loop");
    // if (cookieNum == 3) {
    // break; // do not bake 4th cookie
    // }
    // System.out.println("bake a cookie");
    // continue;
    // }
    // System.out.print("\ndone baking");

    for (int cookieNum = 5; cookieNum > 0; cookieNum--) {
      System.out.println("inside loop");
      if (cookieNum == 3) {
        System.out.println("look at cookie # " + cookieNum);
        continue;// do not eat cookie #3 skip to next value
      }
      System.out.println("eat cookie # " + cookieNum);

    }
    System.out.println("done eating cookies");

  }
}
