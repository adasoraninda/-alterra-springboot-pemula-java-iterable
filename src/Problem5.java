import java.util.ArrayList;

/**
 * Problem 5 - Remove Duplicates
 * input - array with duplicate content
 * output - length of array without duplicate content
 */

public class Problem5 {

  public static void main(String... args) {
    Problem5 problem5 = new Problem5();

    int[] input1 = {2, 3, 3, 3, 6, 9, 9};
    int result1 = problem5.removeDuplicates(input1);
    System.out.println(result1);

    int[] input2 = {2, 2, 2, 11};
    int result2 = problem5.removeDuplicates(input2);
    System.out.println(result2);
  }

  private int removeDuplicates(int[] arr) {
    ArrayList<Integer> results = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      int counter = 0;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          ++counter;
        }
      }

      if (counter == 0) {
        results.add(arr[i]);
      }
    }

    System.out.println(results);
    return results.size();
  }
}
