import java.util.Arrays;

/**
 * Problem 3 - Pair with Target Sum jumlah dari target dalam array, [1,2,3,4,5,6], target = 6
 * output: [1,3] index
 */
public class Problem3 {

  public static void main(String... args) {
    Problem3 problem3 = new Problem3();
    int[] arr1 = {1, 2, 3, 4, 6};
    int target1 = 6;
    System.out.println(Arrays.toString(problem3.pairWithTargetSum(arr1, target1)));

    int[] arr2 = {2, 5, 9, 11};
    int target2 = 11;
    System.out.println(Arrays.toString(problem3.pairWithTargetSum(arr2, target2)));
  }

  private int[] pairWithTargetSum(int[] arr, int target) {
    int[] result = new int[2];

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {

        int sum = arr[i] + arr[j];
        if (sum != target) {
          continue;
        }

        result[0] = i;
        result[1] = j;

        return result;
      }
    }

    return result;
  }

}
