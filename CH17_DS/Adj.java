package CH17_DS;

import java.util.*;
public class Adj {
    int V;
    List<List<Integer>> adjList;
    int[][] adjMatrix;

    public Adj(int V) {
        this.V = V;
        adjList = new ArrayList<>();
        adjMatrix = new int[V][V];

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);

        adjMatrix[u][v] = adjMatrix[v][u] = 1;
    }
    public void displayAdjMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void displayAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (Integer neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

}

class GraphRepresentation {
    public static void main(String[] args) {
        Adj g = new Adj(5);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);

        g.displayAdjMatrix();
        g.displayAdjList();
    }
}


