public interface Vehicle {

  public static final String NAME = "NAME";
  public static final int X = 10;
  public static final int NUM = 1;

  void clean();

  void checkin();

  boolean equals(Vehicle vehicle);

  String location();

}