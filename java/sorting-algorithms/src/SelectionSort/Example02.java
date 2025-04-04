package SelectionSort;

public class Example02 {
  public static void main(String[] args) {
    int[] numeros = {35, 65, 30, 60, 20};

    // Algoritmo de selección
    for(int i = 0; i < numeros.length - 1; i++) {
      int minIndex = i; // Indice del mínimo actual

      // Buscar el elemento mínimo
      for(int j = i + 1; j < numeros.length; j++) {
        if (numeros[j] < numeros[minIndex]) {
          minIndex = j;
        }
      }

      // Intercambiar el mínimo encontrado con el primer elemento no ordenado
      int temp = numeros[minIndex];
      numeros[minIndex] = numeros[i];
      numeros[i] = temp;
    }

    // Mostrar arreglos ordenados
    System.out.println("Arreglo ordenado: ");
    for(int num : numeros) {
      System.out.print(num + " ");
    }
  }
}
