package Queues;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
  public static void main(String[] args) {

    // We use LinkedList because queue is an interface and we can't implemented directly
    Queue<String> staff = new LinkedList<>();

    staff.offer("Maria");
    staff.offer("Lopez");
    staff.offer("Perez");
    staff.offer("Noel");

    System.out.println(staff);
    System.out.println(staff.size());
    System.out.println(staff.contains("Perez"));

    // Queue - FIFO data structure (First-In First-Out) is a collection designed for holding elements prior to processing Linear Data Structure. 
    // Head-->[Karen] [Steve] [Robert] [Michael] <--Tail

    /* Queue Methods:
        (enqueue) add = offer() -> add an object to the tail
        (dequeue) remove = poll() -> remove the head of the queue
        examine it = peek() -> examine and return the head element
        it.isEmpty() -> returns true if the queue is empty   
    */

    /* Deque Interface:
        Two implementations of the Deque interface in the
        Java Collections Framework are:

        ArrayDeque -  is a resizable array-based implementation of the Deque interface. It is faster than Stack and LinkedList for most operations.  Use ArrayDeque when you need a fast stack or queue without null values.

        LinkedList - Stores elements in nodes, each containing data and references to the next and previous elements, Allows null elements, More memory usage than ArrayDeque because of pointers to previous and next nodes. Use LinkedList if you need a list with frequent insertions/removals in the middle.
    */
  }
}
