public class Cat {
  // * Member Variables here *//
  // private variable hides internal class data
  private String name;

  // * Constant *//
  public static final String DEFAULT_NAME = "twinkle";

  private Toy toy;

  private static int lives;

  // * Constructors here *//
  public Cat() {
    // some work here
    // initialize things
    this(DEFAULT_NAME);
  }

  public Cat(String newName) {
    // do work to initialize things
    this(newName, new Toy("blue"));
  }

  public Cat(String newName, Toy newToy) {
    // do work to initialize things
    this(newName, newToy, 9);
  }

  public Cat(String newName, Toy newToy, int newLives) {
    // do work to initialize things
    name = newName;
    toy = newToy;
    lives = newLives;
  }

  // * Getters and Setters here *//
  public Toy getToy() {
    return toy;
  }

  public int getLives() {
    return lives;
  }

  // a getter method
  // allows users of this class to read a private variable
  public String getName() {
    return name;
  }

  // a setter method
  // allows users of this class to write/change a private variable
  public void setName(String newValue) {
    name = newValue;
  }

  // * Behaviors and Operations here *//
  public void meaow() {
    System.out.println("meaow");
  }

  public void jump() {
    System.out.println("jump");
  }

  // * helpers *//
  public int getLevelOfMysteriousness() {
    if (this.name == DEFAULT_NAME) {
      return 10;
    }
    return 2;
  }

  public void play(Toy toy) {
    toy.setColor("red");
  }

  public static void checkHealth() {
    if (lives > 5) {
      System.out.println("all good");
      return;
    }
    System.out.println("not so good");
  }

  // * Overrides *//
  public String toString() {
    return name + "-" + toy.getColor() + " lives: " + lives;
  }

}
