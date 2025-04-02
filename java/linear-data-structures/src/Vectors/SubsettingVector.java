package Vectors;
import java.util.Vector;

public class SubsettingVector {
  public static void main(String[] args) {
    // Create a vector of strings
    Vector<String> staff = new Vector<>();

    staff.add("Anna");
    staff.add("Brown");
    staff.add("Mateo");

    // Here  we are subsetting the vector to get the second element
    String secondMember = staff.get(1);
    System.out.println(secondMember);

    // ----------------- Multiple Elements ------------------

    Vector<String> subsetStaff = new Vector<>();

    subsetStaff.add(staff.get(1));
    subsetStaff.add(staff.get(2));
    System.out.println(subsetStaff);
  }
}
