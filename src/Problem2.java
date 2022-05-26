import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Problem 2 - Angka Muncul Sekali Input berupa string berisi angka. output merupakan list yang
 * muncul hanya 1 kali pada input.
 */
public class Problem2 {

  public static void main(String[] args) {
    Problem2 problem2 = new Problem2();
    System.out.print("Input: ");
    String input = problem2.generateInput();
    System.out.print("Output: ");
    System.out.println(problem2.calculateNumberAppearOnce(input));
  }

  private List<String> calculateNumberAppearOnce(String input) {
    ArrayList<String> result = new ArrayList<>();
    String[] arr = input.split("");

    for (int i = 0; i < arr.length; i++) {
      int counter = 0;
      for (int j = 0; j < arr.length; j++) {
        if (i == j) {
          continue;
        }

        if (Objects.equals(arr[i], arr[j])) {
          counter++;
          break;
        }
      }

      if (counter == 0) {
        result.add(arr[i]);
      }
    }

    return result;
  }

  private String generateInput() {
    Scanner input = new Scanner(System.in);
    String result = input.next().trim();
    input.close();
    return result;
  }

}
