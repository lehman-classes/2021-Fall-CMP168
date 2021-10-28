public class MyObject extends AnotherObject implements TheInterface {

  String a;
  String b;
  String c;

  public MyObject() {
    this("a");
  }

  public MyObject(String valueA) {
    a = valueA;
    b = "b";
    c = "c";
  }

  @Override
  public void someMethod() {
    // TODO Auto-generated method stub

  }

}
