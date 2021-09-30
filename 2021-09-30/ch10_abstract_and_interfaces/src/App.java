import cool.stuff.ClassicItem;
import cool.stuff.CollectibleItem;
import cool.stuff.RareCoin;

public class App {
  public static void main(String[] args) throws Exception {
    String name = "Two Dollar coin";
    int year = 1904;
    int rareValue = 9;

    // ClassicItem classicItem = new ClassicItem(name, year, rareValue);

    RareCoin twoDollarCoin = new RareCoin(name, year, rareValue);
    RareCoin silverDollar = new RareCoin("Silver Dollar", 1902, 10);

    System.out.println(twoDollarCoin.isRestored());
    System.out.println(silverDollar.getName());
  }
}
