package cool.stuff;

public class BaseballCard extends CollectibleItem {

  private String team;

  public BaseballCard(String name, int year, int rarety) {
    super(name, year, rarety);
  }

  public boolean isRestored() {
    if (year < 1940) {
      return true;
    }
    return false;
  }

}
