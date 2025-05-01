package Searching_Algorithms;

//File: TestSearchAlgorithms.java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

public class TestSearchAlgorithms {
 public static void main(String[] args) {

     // Example 1: Linear Search
     int[] unsortedIDs = {45, 12, 78, 34, 23};
     int linearTarget = 34;
     int linearResult = SearchAlgorithms.linearSearch(unsortedIDs, linearTarget);
     System.out.println("Linear Search: Index of " + linearTarget + " = " + linearResult);

     // Example 2: Binary Search
     int[] sortedIDs = {12, 23, 34, 45, 78};
     int binaryTarget = 45;
     int binaryResult = SearchAlgorithms.binarySearch(sortedIDs, binaryTarget);
     System.out.println("Binary Search: Index of " + binaryTarget + " = " + binaryResult);

     // Example 3: DFS on a graph
     Map<Integer, List<Integer>> graph = new HashMap<>();
     graph.put(1, Arrays.asList(2, 3));
     graph.put(2, Arrays.asList(4, 5));
     graph.put(3, Arrays.asList(6));
     graph.put(4, new ArrayList<>());
     graph.put(5, new ArrayList<>());
     graph.put(6, new ArrayList<>());

     System.out.print("DFS starting from node 1: ");
     SearchAlgorithms.dfs(graph, 1, new HashSet<>());
     System.out.println();

     // Example 4: BFS on a graph
     System.out.print("BFS starting from node 1: ");
     SearchAlgorithms.bfs(graph, 1);
     System.out.println();
 }
}