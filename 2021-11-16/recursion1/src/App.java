public class App {

  static int a = 2;

  public static void main(String[] args) throws Exception {
    // reference type
    App app = new App();
    // SomeClass sc = new SomeClass();
    // primitive type
    // int x = 5;

    // // immutable object
    // String name = "Walter";
    // app.printName(name);
    // name = "Skyler";
    // System.out.println(name);
    // primitive
    // int total =
    app.add(1, 2);

    // System.out.println("x is now: " + sc.x);
    // System.out.println(total);
  }

  // public void printName(String name) {
  // name = "Jesse";
  // System.out.println(name);
  // }

  // a = 1, b = 2
  public int add(int a, int b) {
    SomeClass sc = new SomeClass();
    int result = a + b;
    sc.someMethod(result);
    return result;
  }
}
