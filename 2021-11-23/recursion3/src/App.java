public class App {

  int num = 0;

  public static void main(String[] args) throws Exception {

    App app = new App();
    int howMany = 10;
    // app.printHello(howMany);
    // int x = app.addTwo(2);
    // System.out.println(x);
    app.printHelloInteractive(howMany);
  }

  public int addTwo(int x) {
    x = x + 2;
    num++;
    if (num < 5) {
      return addTwo(x);
    }

    return x;
  }

  // non-recursive
  public void printHelloInteractive(int howMany) {
    int value = howMany;
    while (value > 0) {
      System.out.println("Hello");
      value--;
    }
  }

  // recursive
  public void printHello(int howMany) {

    // the stuff that it does
    System.out.println("Hello");

    // base case (termination point)
    num++;
    if (num == howMany) {
      return;
    }
    // (end) termination point

    // call to itself
    printHello(howMany);

  }

}
