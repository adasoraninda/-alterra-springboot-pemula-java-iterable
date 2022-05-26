import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem 6 - Maximum sum subarray of size k input - array and number (k), output - jumlah maksimum
 * dari sub array (k)
 * <p>
 * ex: input: [2,1,5,1,3,2], k=3. output: 9 (subarray with maximum sum is [5,1,3].
 */

public class Problem6 {

  public static void main(String... args) {
    Problem6 problem6 = new Problem6();

    int[] input1 = {2, 1, 5, 1, 3, 2};
    int k1 = 3;
    int result1 = problem6.maximumSumSubArrayOf(input1, k1);
    System.out.println(result1);

    System.out.println();

    int[] input2 = {2, 3, 4, 1, 5};
    int k2 = 2;
    int result2 = problem6.maximumSumSubArrayOf(input2, k2);
    System.out.println(result2);
  }

  private int maximumSumSubArrayOf(int[] arr, int size) {
    ArrayList<ArrayList<Integer>> subArrays = new ArrayList<>();
    int index = 0;

    for (int i = size; i <= arr.length; i++) {
      ArrayList<Integer> subArr = new ArrayList<>();

      for (int j = index; j < i; j++) {
        subArr.add(arr[j]);
      }

      System.out.println(subArr);
      subArrays.add(subArr);
      index++;
    }

    List<Integer> results = subArrays.stream().map(
            integers -> integers.stream().reduce(0, Integer::sum))
        .collect(Collectors.toList());

    System.out.println(results);

    return results.stream().max(Integer::compareTo).orElse(0);
  }

}
