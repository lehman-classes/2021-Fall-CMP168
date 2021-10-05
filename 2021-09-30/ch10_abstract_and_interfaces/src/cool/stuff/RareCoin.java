package cool.stuff;

public class RareCoin extends CollectibleItem {

  private int amountOfRidges;

  public RareCoin() {
    System.out.println("Rare Coin constructor");
  }

  /**
   * Constructors
   * 
   * @param name
   * @param year
   * @param rarety
   */
  public RareCoin(String name, int year, int rarety) {
    super(name, year, rarety);
    System.out.println("RareCoin constructor - name, year, rarety");
  }

  public RareCoin(String name, int year, int rarety, int newRidges) {
    super(name, year, rarety);
    amountOfRidges = newRidges;
  }

  public int getAmountOfRidges() {
    return amountOfRidges;
  }

  public boolean isRestored() {
    if (year < 1900) {
      return true;
    }
    return false;
  }
}
