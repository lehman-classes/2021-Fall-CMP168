import java.util.ArrayList;
import java.util.Collection;

public class App {
  public static void main(String[] args) throws Exception {

    int[] nums = { 1, 3, 5, 7 };

    int[] newArray = new int[nums.length + 1];
    copyTo(newArray, nums);
    nums = newArray;
    nums[4] = 9;

    ArrayList numbers = new ArrayList<>();
    numbers.add(2);

  }

  public static void copyTo(int[] newArray, int[] oldArray) {
    for (int i = 0; i < oldArray.length; i++) {
      newArray[i] = oldArray[i];
    }
  }
}
