public class Player extends Athlete {
  private String sport;
  private int favoriteNumber;

  public Player() {
  }

  public Player(String newName, int newAge, String newSport, int newFavoriteNumber) {
    super(newName, newAge);
    sport = newSport;
    favoriteNumber = newFavoriteNumber;
  }

  public String getSport() {
    return sport;
  }

  public int getFavoriteNumber() {
    return favoriteNumber;
  }

}
