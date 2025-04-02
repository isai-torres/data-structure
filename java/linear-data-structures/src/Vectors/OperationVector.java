package Vectors;
import java.util.Vector;

public class OperationVector {
 public static void main(String[] args) {
  Vector<Integer> num = new Vector<>();

  num.add(2);
  num.add(3);
  num.add(1);

  for(int i = 0; i < num.size(); i++) {
    num.set(i, num.get(i) * 3);
  }

  System.out.println(num);
 }
}
