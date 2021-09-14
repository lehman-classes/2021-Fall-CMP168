public class App {

  int value;

  public static void main(String[] args) throws Exception {
    App app = new App();
    // * passing primitive values (pass-by-value)
    // int luckyNumber = 7;
    // app.printNumber(luckyNumber);
    // System.out.println(luckyNumber); // still prints 7 - value not changed


    // * passing non-primitive values (object references are passed-by-value)
    app.value = 1;
    app.printValue(app);
    System.out.println(app.value); // still prints 5 - value changed
  }

  public int printNumber(int num) {
    System.out.println(num);

    // change value and print again
    num = 3;
    System.out.println(num); // prints 3 - value changed
    
    return num;
  }

  public App printValue(App app) {
    System.out.println(app.value); // should print 1

    app.value = 5;
    System.out.println(app.value); // should print 5
    return app;
  }
}
