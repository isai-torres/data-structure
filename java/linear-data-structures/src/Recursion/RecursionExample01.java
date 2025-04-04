package Recursion;

public class RecursionExample01 {
  public static void main(String[] args) {
    // Call the walk method
    walk(10);
  }

  // Recursive method
  public static void walk(int steps) {
    System.out.println("Hello World");
    if(steps <= 1) { // We use this condition to stop the recursion (Base case)
      return;
    }
    walk(steps - 1); // (Recursive case) -1 subtract 1 from the steps every time the method is called
  }
}


/* Recursion = a function that calls itself from within
               helps to visualize a complex problem into basic steps,
               Which can be solved more easily iteratively or recursively.
*/