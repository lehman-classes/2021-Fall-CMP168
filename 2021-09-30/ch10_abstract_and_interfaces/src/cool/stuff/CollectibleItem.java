package cool.stuff;

/* rare coins, baseball cars and classic cars */
public abstract class CollectibleItem {

  protected String name;
  protected int year;
  protected int rarety;

  // public CollectibleItem() {
  // System.out.println("CollectibleItem constructor");
  // }

  public CollectibleItem(String newName, int newYear, int newRarety) {
    name = newName;
    year = newYear;
    rarety = newRarety;
    System.out.println("CollectibleItem constructor - name, year, rarety");
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

  public int getRareValue() {
    return rarety;
  }

  public abstract boolean isRestored();

}
