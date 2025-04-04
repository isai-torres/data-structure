package Queues;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
  public static void main(String[] args) {
    // Create a deque based on an array
    Deque<Integer> deque = new ArrayDeque<>();

    // Add elements to the end and start
    deque.offerLast(10); // Add 10 at the end
    deque.offerLast(20); // Add 20 at the end
    deque.offerFirst(5); // Add 5 at the start

    System.out.println(deque);

    // ----------- Remove elements form the start and end --------------

    System.out.println(deque.pollFirst());
    System.out.println(deque.pollLast());

    // See elements at the start without removing it
    System.out.println(deque.peekFirst());

  }
}
