package Graphs.ZallMethodGraph;

import java.util.Scanner;


public class ZallMethod_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AllMethod_Graph myGraph = new AllMethod_Graph();

        System.out.println("=== CREATE GRAPH ===");
        System.out.print("How many vertices do you want to add? ");
        int numVertices = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numVertices; i++) {
            System.out.print("Enter name of vertex " + i + ": ");
            String vertex = scanner.nextLine().toUpperCase();
            myGraph.addVertex(vertex);
        }

        System.out.print("\nHow many edges (connections) do you want to add? ");
        int numEdges = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numEdges; i++) {
            System.out.println("Edge " + i + ":");
            System.out.print("  From: ");
            String v1 = scanner.nextLine().toUpperCase();
            System.out.print("  To: ");
            String v2 = scanner.nextLine().toUpperCase();
            myGraph.addEdge(v1, v2);
        }

        System.out.println("\nðŸ“Œ Graph created:");
        myGraph.printGraph();

        System.out.println("\n=== MODIFY GRAPH ===");

        System.out.print("Do you want to remove an edge? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.print("  From: ");
            String v1 = scanner.nextLine().toUpperCase();
            System.out.print("  To: ");
            String v2 = scanner.nextLine().toUpperCase();
            myGraph.removeEdge(v1, v2);
            System.out.println("Edge removed.");
        }

        System.out.print("Do you want to remove a vertex? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.print("  Vertex name: ");
            String v = scanner.nextLine().toUpperCase();
            myGraph.removeVertex(v);
            System.out.println("Vertex removed.");
        }

        System.out.println("\n Final Graph:");
        myGraph.printGraph();

        scanner.close();
    }
}


/**Expected Outcome

=== CREATE GRAPH_YOU MUST WRITE ===

How many vertices do you want to add? 4
Enter name of vertex 1: A
Enter name of vertex 2: B
Enter name of vertex 3: C
Enter name of vertex 4: D

How many edges (connections) do you want to add? 4
Edge 1:
  From: A
  To: B
Edge 2:
  From: B
  To: C
Edge 3:
  From: C
  To: D
Edge 4:
  From: D
  To: A

ðŸ“Œ Graph created:
A â†’ [B, D]
B â†’ [A, C]
C â†’ [B, D]
D â†’ [C, A]

=== MODIFY GRAPH ===
Do you want to remove an edge? (yes/no): yes
  From: A
  To: B
Edge removed.
Do you want to remove a vertex? (yes/no): yes
  Vertex name: C
Vertex removed.

Final Graph:
A â†’ [D]
B â†’ []
D â†’ [A]
 
*/