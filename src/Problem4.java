import java.util.ArrayList;
import java.util.List;

/**
 * Problem 4 - Array Unique input - 2 array number (int) output - 1 array berupa kumpulan angka di
 * array pertama tetapi tidak memiliki duplikasi di array ke 2
 */
public class Problem4 {

  public static void main(String... args) {
    Problem4 problem4 = new Problem4();

    int[] input1 = {1, 2, 3, 4};
    int[] input2 = {1, 3, 5, 10, 16};
    List<Integer> result1 = problem4.arrayUnique(input1, input2);
    System.out.println(result1);

    int[] input3 = {3, 8};
    int[] input4 = {2, 8};
    List<Integer> result2 = problem4.arrayUnique(input3, input4);
    System.out.println(result2);
  }

  private List<Integer> arrayUnique(int[] arr1, int[] arr2) {
    ArrayList<Integer> results = new ArrayList<>();

    for (int k : arr1) {
      int counter = 0;
      for (int i : arr2) {
        if (k == i) {
          ++counter;
        }
      }
      if (counter == 0) {
        results.add(k);
      }
    }

    return results;
  }

}
