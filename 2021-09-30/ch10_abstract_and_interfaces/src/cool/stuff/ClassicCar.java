package cool.stuff;

public class ClassicCar extends CollectibleItem {
  public ClassicCar(String name, int year, int rarety) {
    super(name, year, rarety);
  }

  public boolean isRestored() {
    if (year < 1960) {
      return true;
    }
    return false;
  }
}
