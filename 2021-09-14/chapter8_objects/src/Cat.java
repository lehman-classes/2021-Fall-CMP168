public class Cat {
  // * Member Variables here *//
  // private variable hides internal class data
  private String name;

  // * Constant *//
  private static final String DEFAULT_NAME = "purple";

  // * Constructors here *//
  public Cat() {
    // some work here
    // initialize things
    this(DEFAULT_NAME);
  }

  public Cat(String theName) {
    // do work to initialize things
    name = theName;
  }

  // * Getters and Setters here *//
  // a getter method
  // allows users of this class to read a private variable
  public String getName() {
    return name;
  }

  public int getLevelOfMysteriousness() {
    if (this.name == DEFAULT_NAME) {
      return 10;
    }
    return 2;
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

}
