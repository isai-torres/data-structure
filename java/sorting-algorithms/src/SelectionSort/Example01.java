package SelectionSort;

public class Example01 {
  public static void main(String[] args) {
    int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
    
    // Print the unsorted array
    System.out.println("Unsorted array:");
    for (int i : array) {
      System.out.print(i);
    }
    
    System.out.println(); // Print a new line for better readability
    System.out.println(); // Print a new line for better readability

    selectionSort(array);

    // Print the sorted array
    System.out.println("Sorted array:");
    for (int i : array) {
      System.out.print(i);
    }
  }

  private static void selectionSort(int[] array) {
    for(int i = 0; i < array.length - 1; i++) { // The first loop iterates through the array
      int min = i;
      for(int j = i + 1; j < array.length; j++) { 
        if(array[min] > array[j]) {
          min = j;
        }
      }

      int temp = array[i];
      array[i] = array[min]; // Swap the elements
      array[min] = temp; // Swap the elements
    }
  }
}

/* selection sort = search through an array and keep track of the minimum 
                    value during each iteration. At the end of each iteration,
                    we swap variables.
*/
