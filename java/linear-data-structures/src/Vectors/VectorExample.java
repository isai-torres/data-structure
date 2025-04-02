package Vectors;
import java.util.Vector;

public class VectorExample {
  public static void main(String[] args){
    Vector<String> staff = new Vector<>();
    staff.add("Adams");
    staff.add("Robert");
    staff.add("Melanie");

    Vector<Integer> number = new Vector<>();
    number.add(2);
    number.add(7);
    number.add(9);

    System.out.println(staff);
    System.out.println(number);
  }
}
