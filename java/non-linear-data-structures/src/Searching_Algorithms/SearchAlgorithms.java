package Searching_Algorithms;

//File: SearchAlgorithms.java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class SearchAlgorithms {

 // Linear Search: for unsorted arrays
 public static int linearSearch(int[] arr, int target) {
     for (int i = 0; i < arr.length; i++) {
         if (arr[i] == target)
             return i;
     }
     return -1;
 }

 // Binary Search: for sorted arrays
 public static int binarySearch(int[] arr, int target) {
     int low = 0, high = arr.length - 1;
     while (low <= high) {
         int mid = low + (high - low) / 2;
         if (arr[mid] == target)
             return mid;
         else if (arr[mid] < target)
             low = mid + 1;
         else
             high = mid - 1;
     }
     return -1;
 }

 // Depth-First Search: graph traversal
 public static void dfs(Map<Integer, List<Integer>> graph, int start, Set<Integer> visited) {
     visited.add(start);
     System.out.print(start + " ");
     for (int neighbor : graph.getOrDefault(start, new ArrayList<>())) {
         if (!visited.contains(neighbor)) {
             dfs(graph, neighbor, visited);
         }
     }
 }

 // Breadth-First Search: graph traversal
 public static void bfs(Map<Integer, List<Integer>> graph, int start) {
     Set<Integer> visited = new HashSet<>();
     Queue<Integer> queue = new LinkedList<>();
     queue.offer(start);
     visited.add(start);

     while (!queue.isEmpty()) {
         int node = queue.poll();
         System.out.print(node + " ");
         for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
             if (!visited.contains(neighbor)) {
                 queue.offer(neighbor);
                 visited.add(neighbor);
             }
         }
     }
 }
}