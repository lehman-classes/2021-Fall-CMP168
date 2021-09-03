public class App {

  static void printGreeting(String nameOne) {

    System.out.printf("Hello there, %s\n", nameOne);
    nameOne = "THERE THERE";
  }

  static void showNum(int x) {
    System.out.println(x);
    x = 2;
  }

  public static void main(String[] args) throws Exception {

    // App app = new App();
    // app.printGreeting("Friends");

    int num = 1;
    showNum(num);
    System.out.println(num);

    // String nameTwo = "Friends";
    // printGreeting(nameTwo);
    // System.out.println(nameTwo);
  }
}
