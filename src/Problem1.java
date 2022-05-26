import java.util.Arrays;

/**
 * Problem 1 - Array Merge Program menggabungkan 2 array yang tidak ada duplikasi.
 */

public class Problem1 {

  public static void main(String... args) {
    Problem1 problem1 = new Problem1();

    String[] arr1 = {"kazuya", "jin", "lee"};
    String[] arr2 = {"kazuya", "feng"};
    String[] results1 = problem1.mergeArr(arr1, arr2);
    System.out.println(Arrays.toString(results1));

    String[] arr3 = {"lee","jin"};
    String[] arr4 = {"kazuya", "panda"};
    String[] results2 = problem1.mergeArr(arr3, arr4);
    System.out.println(Arrays.toString(results2));

    String[] arr5 = {"lee","lee"};
    String[] arr6 = {"lee", "lee"};
    String[] results3 = problem1.mergeArr(arr5, arr6);
    System.out.println(Arrays.toString(results3));
  }

  private String[] mergeArr(String[] arr1, String[] arr2) {
    String[] mergedArr = new String[arr1.length + arr2.length];

    int i = 0;
    int j = 0;

    while (i < mergedArr.length) {

      if (i >= arr1.length) {
        mergedArr[i] = arr2[j];
        j++;
      } else {
        mergedArr[i] = arr1[i];
      }

      i++;
    }

    for (int k = 0; k < mergedArr.length; k++) {
      for (int l = 0; l < mergedArr.length; l++) {
        if (k == l) {
          continue;
        }

        if (!mergedArr[k].equalsIgnoreCase(mergedArr[l])) {
          continue;
        }

        mergedArr = shiftArr(mergedArr, mergedArr.length - 1, l);
      }
    }

    return mergedArr;
  }

  private String[] shiftArr(String[] arr, int size, int position) {
    String[] newArr = new String[size];

    for (int i = 0; i < arr.length; i++) {
      try {
        if (i >= position) {
          newArr[i] = arr[i + 1];
        } else {
          newArr[i] = arr[i];
        }
      } catch (Exception ignored) {

      }
    }

    return newArr;
  }

}
