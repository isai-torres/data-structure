package InsertionSort;

public class Example02 {

  private static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int nextVal = arr[i];
      int j = i - 1;

      // Desplazar elementos mayores que nextVal hacia la derecha
      while (j >= 0 && arr[j] > nextVal) {
        arr[j + 1] = arr[j];
        j--;
      }
      // Insertar nextVal en su posición correcta
      arr[j + 1] = nextVal;
    }
  }

  public static void main(String[] args) {
    int[] data = {30, 25, 15, 20, 28};

    System.out.println("Array Original: ");
    // Loop to print the original array
    for (int num : data) {
      System.out.print(num + " ");
    }

    System.out.println(); // Print a new line for better readability

    insertionSort(data);

    System.out.println("Array Ordenado: ");
    for (int num : data) {
      System.out.print(num + " ");
    }
  }
}
