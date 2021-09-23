
public class App {

  public static void play(Toy toy) {
    toy.setColor("black");
  }

  public static void main(String[] args) throws Exception {

    Toy toy = new Toy("Green");
    int lives = 20;
    Cat cat = new Cat("Carl", toy, lives);

    // Cat.checkHealth();
    // cat.checkHealth();

    // System.out.println(Cat.DEFAULT_NAME);

    // System.out.println(cat);
    // App.play(toy);
    // lives = 30;
    // System.out.println(cat);

    // Cat cat1 = new Cat();
    // cat1.setName("cool name");
    // // Cat cat2 = new Cat();
    // Cat cat2 = cat1;

    // System.out.println(cat1.hashCode());
    // System.out.println(cat2.hashCode());
    // System.out.println(cat1.equals(cat2));

    // int x = 1;
    // // int y = 2;
    // int y = x;
    // x = 3;
    // System.out.println(x);
    // System.out.println(y);

    // // Cat jerryTheCat = new Cat("Jerry");
    // defaultCat.setName("Pauly");
    // defaultCat.jump();

    // System.out.println(defaultCat.getLevelOfMysteriousness());
    // System.out.println(defaultCat2.getLevelOfMysteriousness());
    // // System.out.println(jerryTheCat.getName());

  }

}
