public class Sedan implements Vehicle {

  @Override
  public void clean() {
    System.out.println("sedan is clean");
  }

  @Override
  public void checkin() {
    System.out.println("sedan is checked in");
  }

  @Override
  public String location() {
    return "sedan garage";
  }

}