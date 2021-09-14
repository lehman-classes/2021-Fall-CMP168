public class App {
  public static void main(String[] args) throws Exception {
    Cat defaultCat = new Cat();
    Cat defaultCat2 = new Cat();

    // Cat jerryTheCat = new Cat("Jerry");
    defaultCat.setName("Pauly");
    defaultCat.jump();

    System.out.println(defaultCat.getLevelOfMysteriousness());
    System.out.println(defaultCat2.getLevelOfMysteriousness());
    // System.out.println(jerryTheCat.getName());

  }
}
