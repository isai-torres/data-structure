package MergeSort;

public class Example01 {

  // Recursive function to perform merge sort
  private static void mergeSort(int[] arr, int l, int r) {
    if (l < r) { // Base condition: if the left index is less than the right index
      int mid = (l + r) / 2; // Find the middle point of the array

      // Recursively sort the left half
      mergeSort(arr, l, mid);

      // Recursively sort the right half
      mergeSort(arr, mid + 1, r);

      // Merge the two sorted halves
      merge(arr, l, mid, r);
    }
  }

  // Function to merge two sorted subarrays
  private static void merge(int[] arr, int l, int mid, int r) {
    // Calculate the sizes of the two subarrays
    int n1 = mid - l + 1; // Size of the left subarray
    int n2 = r - mid;     // Size of the right subarray

    // Create temporary arrays to hold the elements of the subarrays
    int[] lArr = new int[n1];
    int[] rArr = new int[n2];

    // Copy data to the left subarray
    for (int x = 0; x < n1; x++) {
      lArr[x] = arr[l + x];
    }

    // Copy data to the right subarray
    for (int x = 0; x < n2; x++) {
      rArr[x] = arr[mid + 1 + x];
    }

    // Merge the two subarrays back into the original array
    int i = 0, j = 0, k = l; // Initialize pointers for left, right, and merged arrays

    // Compare elements from both subarrays and copy the smaller one into the original array
    while (i < n1 && j < n2) {
      if (lArr[i] <= rArr[j]) { // If the current element in the left subarray is smaller
        arr[k] = lArr[i];
        i++;
      } else { // If the current element in the right subarray is smaller
        arr[k] = rArr[j];
        j++;
      }
      k++; // Move to the next position in the merged array
    }

    // Copy any remaining elements from the left subarray
    while (i < n1) {
      arr[k] = lArr[i];
      i++;
      k++;
    }

    // Copy any remaining elements from the right subarray
    while (j < n2) {
      arr[k] = rArr[j];
      j++;
      k++;
    }
  }

  public static void main(String[] args) {
    // Input array to be sorted
    int[] arr = {3, 5, 1, 4, 6, 2};

    // Print the array before sorting
    System.out.println("Before Sorting:");
    for (int numbers : arr) {
      System.out.print(numbers + " ");
    }

    System.out.println(); // Print a new line for better readability
    System.out.println("After Sorting:");

    // Perform merge sort on the array
    mergeSort(arr, 0, arr.length - 1);

    // Print the array after sorting
    for (int numbers : arr) {
      System.out.print(numbers + " ");
    }
  }
}