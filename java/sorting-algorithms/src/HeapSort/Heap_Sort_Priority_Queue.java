package HeapSort;

import java.util.PriorityQueue;
import java.util.Arrays;

public class Heap_Sort_Priority_Queue {

  // Método: ordenar usando PriorityQueue (min-heap)
  public static void heapSortWithPriorityQueue(Integer[] arr) {
    // Por defecto, PriorityQueue ordena en forma ascendente (min-heap)
    PriorityQueue<Integer> heap = new PriorityQueue<>();

    // Si desea ordenar en forma descendente, use:
    // PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

    // Insertar todos los elementos al heap
    for (int num : arr) {
      heap.add(num);
    }

    // Extraer los elementos en orden y colocarlos nuevamente en el arreglo
    for (int i = 0; i < arr.length; i++) {
      arr[i] = heap.poll();
    }
  }

  public static void main(String[] args) {
    // Arreglo basado en la imagen
    Integer[] arr = {89, 76, 74, 37, 32, 39, 66, 20, 26, 18, 28, 29, 6};

    System.out.println("Original array:");
    System.out.println(Arrays.toString(arr));

    heapSortWithPriorityQueue(arr);

    System.out.println("\nSorted array (ascending):");
    System.out.println(Arrays.toString(arr));
  }
}
