package TreeTraversal_Package;
import java.util.Scanner;

public class TreeTraversal_Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter root node: ");
        TreeTraversal root = new TreeTraversal(input.nextLine());

        System.out.print("Enter left child of " + root.data + ": ");
        root.left = new TreeTraversal(input.nextLine());

        System.out.print("Enter right child of " + root.data + ": ");
        root.right = new TreeTraversal(input.nextLine());

        System.out.print("Enter left child of " + root.data + ": ");
        root.left = new TreeTraversal(input.nextLine());

        System.out.print("Enter right child of " + root.data + ": ");
        root.right = new TreeTraversal(input.nextLine());

        System.out.println("\nIn-order Traversal: ");
        root.inOrder();

        System.out.println("\nPre-order Traversal: ");
        root.preOrder();

        System.out.println("\nPost-order Traversal: ");
        root.postOrder();

        input.close();
    }
}
