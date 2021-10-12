public class Renter implements Comparable<Vehicle> {

  public void checkin(Vehicle vehicle) {
    vehicle.checkin();
  }

  @Override
  public int compareTo(Vehicle vehicle) {

    return 0;
  }

}
