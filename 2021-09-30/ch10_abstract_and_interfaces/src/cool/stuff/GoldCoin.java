package cool.stuff;

public class GoldCoin extends RareCoin {

  // public GoldCoin() {
  // System.out.println("Gold Coin constructor");
  // }
  public GoldCoin(String name, int year, int rarety) {
    super(name, year, rarety);
    System.out.println("GoldCoin constructor - name, year, rarety");
  }
}
