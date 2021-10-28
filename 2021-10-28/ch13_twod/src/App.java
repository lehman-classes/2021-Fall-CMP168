import java.util.Random;

public class App {
  public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");

    // [0,]

    int[][] numbers = new int[5][5];
    Random r = new Random();
    // int[] row0 = new int[5];
    // int[] row1 = new int[2];
    // int[] row2 = new int[4];
    // int[] row3 = new int[6];
    // int[][] numbers = { row0, row1, row2, row3 };

    // String[] names = {};

    System.out.println(numbers.length); // row length
    // System.out.println(numbers[0].length); // row 0 column length
    // System.out.println(numbers[0][0]); // actual value at location row of index 0
    // and column of index 0
    // System.out.println(numbers[2][0]); // last item in 2d array

    for (int i = 0; i < numbers.length; i++) {
      // System.out.print("Row: " + (i + 1));
      for (int j = 0; j < numbers[i].length; j++) {
        // System.out.print(" Column: " + (j + 1) + " value: " + numbers[i][j]);

        // logic to check game status
        // if checked print *, otherwise print -
        System.out.print("[" + "*-".charAt(r.nextInt(2)) + "]");
        // System.out.printf("[%d,%d]", i, j);
      }
      System.out.println();
    }

    // System.out.println(names[0]);
  }
}
