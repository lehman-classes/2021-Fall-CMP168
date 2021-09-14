public class App {

  int m = 8;

  public App() {
    System.out.println("default constructor");
  }

  public int getValue() {
    return m;
  }

public static int sum(int[] arr) {
  return 0;
}

public static int sum(int[] arr, int index0, int indexX) {
  return 0;
}


  public static void main(String[] args) throws Exception {
    int[] scores = { 1, 2, 3, 4, 5 };
    int temp = scores[0];
    scores[0] = scores[4];
    scores[4] = temp;

    App app = new App();
    int val = app.getValue();
    System.out.println(val);

    System.out.println(scores[0] + " " + scores[4]);

    String[] names = { "one", "two", "three", "four" };
    System.out.println(names[1]);
  }
}
