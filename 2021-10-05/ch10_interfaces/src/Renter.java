public class Renter implements Comparable<Compact> {

  public void checkin(Vehicle vehicle) {
    vehicle.checkin();
  }

  @Override
  public boolean compareTo(Compact vehicle) {

    return vehicle.equals(vehicle);
  }

}
