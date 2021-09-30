package cool.stuff;

public class RareCoin extends CollectibleItem {
  private int amountOfRidges;

  public RareCoin(String name, int year, int rarety) {
    super(name, year, rarety);
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
