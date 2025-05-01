package Graphs.ZallMethodGraph;

import java.util.ArrayList;
import java.util.HashMap;



public class AllMethod_Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    // Add a vertex
    public boolean addVertex(String vertex) {
        if (!adjList.containsKey(vertex)) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    // Add an edge (undirected)
    public boolean addEdge(String vertex1, String vertex2) {
        if (adjList.containsKey(vertex1) && adjList.containsKey(vertex2)) {
            if (!adjList.get(vertex1).contains(vertex2)) {
                adjList.get(vertex1).add(vertex2);
                adjList.get(vertex2).add(vertex1);
            }
            return true;
        }
        return false;
    }

    // Remove an edge
    public boolean removeEdge(String vertex1, String vertex2) {
        if (adjList.containsKey(vertex1) && adjList.containsKey(vertex2)) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    // Remove a vertex
    public boolean removeVertex(String vertex) {
        if (!adjList.containsKey(vertex)) return false;

        for (String neighbor : adjList.get(vertex)) {
            adjList.get(neighbor).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }

    // Print the adjacency list
    public void printGraph() {
        System.out.println("\nGraph:");
        for (String vertex : adjList.keySet()) {
            System.out.println(vertex + " â†’ " + adjList.get(vertex));
        }
    }
}
