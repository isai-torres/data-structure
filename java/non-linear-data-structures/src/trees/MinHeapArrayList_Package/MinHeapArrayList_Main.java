package MinHeapArrayList_Package;

public class MinHeapArrayList_Main {
    public static void main(String[] args) {
        MinHeapArrayList heap = new MinHeapArrayList();

        int[] values = {8, 18, 29, 20, 28, 39, 66, 37, 26, 76, 32, 74, 89};
        for (int value : values) {
            heap.insert(value);
        }

        System.out.println("Initial Heap:");
        heap.printHeap();

        int removed = heap.removeMin();
        System.out.println("\nRemoved min value: " + removed);

        System.out.println("Heap after removal:");
        heap.printHeap();
    }
}
