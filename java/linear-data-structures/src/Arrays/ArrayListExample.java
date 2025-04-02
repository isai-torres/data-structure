package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(5);
    numbers.add(2);
    numbers.add(8);
    numbers.add(1);

    Collections.sort(numbers); // This will sort the list in ascending order
    System.out.println(numbers);
  }
}
