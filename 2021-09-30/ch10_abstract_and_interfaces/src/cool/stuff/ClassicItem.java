package cool.stuff;

/* 
Rare Coin
Rare Baseball Card
Classic Car
*/
public class ClassicItem {

  private String name;
  private int year;
  private int rareValue;

  public ClassicItem(String newName, int newYear, int newRareValue) {
    name = newName;
    year = newYear;
    rareValue = newRareValue;
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

  public int getRareValue() {
    return rareValue;
  }
}
