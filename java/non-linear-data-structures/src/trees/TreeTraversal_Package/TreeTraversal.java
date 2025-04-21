package TreeTraversal_Package;

public class TreeTraversal {

    String data; // If you require integer values on the nodes, change data to: int data;
    TreeTraversal left, right;

    // Constructor
    public TreeTraversal(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // In-order Traversal: Left, Root, Right
    public void inOrder() {
        if (left != null) left.inOrder();
        System.out.print(data + " ");
        if (right != null) right.inOrder();
    }

    // Pre-order Traversal: Root, Left, Right
    public void preOrder() {
        System.out.print(data + " ");
        if (left != null) left.preOrder();
        if (right != null) right.preOrder();
    }

    // Post-order Traversal: Left, Right, Root
    public void postOrder() {
        if (left != null) left.postOrder();
        if (right != null) right.postOrder();
        System.out.print(data + " ");
    }
}
