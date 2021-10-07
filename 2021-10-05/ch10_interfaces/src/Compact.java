public class Compact implements Vehicle {

  @Override
  public void clean() {
    System.out.println("compact is clean");
  }

  @Override
  public void checkin() {
    // for compact car you must also, do something extra
    clean();
    System.out.println("compact is checked in");
  }

  @Override
  public String location() {
    return "compact garage";
  }

}
