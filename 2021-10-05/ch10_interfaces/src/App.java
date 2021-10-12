public class App {
  public static void main(String[] args) throws Exception {

    /*
     * Car Rental Business
     * 
     * Rental Company Renters Sales Person Agreement Car
     * 
     * Company - name, address, phone, website, inventory, employees, Renter -
     * name,..., rentCar, signAgreement, dropoff, checkin, pay SalesPerson -
     * name,..., takePayment, checkAgreement Agreement - date, contract entities,
     * isSigned Car - brand, year, model, location, checkedIn, isClean
     * 
     */

    Renter renter = new Renter();
    Compact vehicle = new Compact();

    renter.checkin(vehicle);

    int isIt = renter.compareTo(vehicle);

    System.out.println(isIt);

  }
}
