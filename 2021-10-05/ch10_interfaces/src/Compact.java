public class Compact implements Vehicle {

  private static String name = "COMPACT";

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

  @Override
  public boolean equals(Vehicle vehicle) {
    return vehicle.location().equals(this.location());
  }

}
