package Stacks;
import java.util.Stack;

public class StackExample {
  public static void main(String[] args) {
    // Stack = LIFO data structure (Last-In Last-Out), a Stack stores objects into a sort of "vertical tower"
    /* Stack methods:
        push() to add to the top
        pop() to remove from the top, also returns the object removed
        peek() looks at the object at the top of the Stack without removing it
        empty() test if the stack is empty
        search() search a Stack for an item    
    */

    Stack<String> games = new Stack<>();

    games.push("Minecraft");
    games.push("Skyrim");
    games.push("DOOM");
    games.push("Borderlands");
    games.push("FFVII");

    games.pop();
    games.pop();
    games.pop();

    System.out.println(games);
  }
}
