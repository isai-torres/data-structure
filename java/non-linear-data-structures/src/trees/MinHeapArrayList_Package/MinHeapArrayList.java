package MinHeapArrayList_Package;

import java.util.ArrayList;

public class MinHeapArrayList {
    private ArrayList<Integer> heap;

    public MinHeapArrayList() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;

        // Heapify up
        while (current > 0 && heap.get(current) < heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int removeMin() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap is empty!");

        int lastIndex = heap.size() - 1;
        int min = heap.get(0);

        // Move the last element to the root
        heap.set(0, heap.get(lastIndex));
        heap.remove(lastIndex);

        // Heapify down
        int parent = 0;
        while (true) {
            int leftChild = 2 * parent + 1;
            int rightChild = leftChild + 1;
            int minChild = leftChild;

            if (leftChild >= heap.size()) break;

            if (rightChild < heap.size() && heap.get(rightChild) < heap.get(leftChild)) {
                minChild = rightChild;
            }

            if (heap.get(parent) > heap.get(minChild)) {
                swap(parent, minChild);
                parent = minChild;
            } else {
                break;
            }
        }

        return min;
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    public void printHeap() {
        System.out.println(heap);
    }
}

