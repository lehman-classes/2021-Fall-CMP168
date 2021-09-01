import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    char shirtSize = 'L';
    switch (shirtSize) {
      case 'M':// eliminate break to also print the next case’s instructions
      case 'm':
        System.out.print("Size Medium");
        break;
      case 'L':// eliminate break to also print the next case’s instructions  
      case 'l':
        System.out.print("Size Large");
        break;
      case 'X':// eliminate break to also print the next case’s instructions
      case 'x':
        System.out.print("Size XLarge");
      default:
        System.out.println("One Size Fits All");
    }
  }
}
