package CH17_DS;

import java.util.*;
public class Graph {
    private int vertices;
    private final LinkedList<Integer>[] adjList;
    public Graph(int vertices){
        this.vertices=vertices+1;
        adjList=new LinkedList[this.vertices];
        for(int i=0;i<= vertices;i++){
            adjList[i]=new LinkedList<>();
        }
    }
    public void addEdge(int s,int d){
        adjList[s].add(d);
        adjList[d].add(s);
    }
    public void printGraph(){
        for(int i=1;i < vertices;i++){
            System.out.print("Vertex"+i+": ");
            for(Integer node: adjList[i]){
                System.out.print(" -> "+node);
            }
            System.out.println();
        }
    }
    public void BFS(int sVertex){
        boolean[] visited = new boolean[vertices];
        Queue<Integer> q= new LinkedList<>();
        visited[sVertex]=true;
        q.add(sVertex);
        System.out.print("BFS Traversal: ");
        while(!q.isEmpty()){
            int vertex= q.poll();
            System.out.print(vertex + " ");
            for(int neighbor : adjList[vertex]){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    q.add(neighbor);
                }
            }
        }
    }
    public void DFS(int startVertex) {
        boolean[] visited=new boolean[vertices];
        Stack<Integer> stack =new Stack<>();
        stack.push(startVertex);
        System.out.print("DFS TRAVERSAL: ");
        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            if(!visited[vertex]) {
                System.out.print(vertex + " ");
                visited[vertex]=true;
            }
            for(int neighbor : adjList[vertex]) {
                if(!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Graph g=new Graph(6);
        g.addEdge(1,2);
        g.addEdge(1,4);
        g.addEdge(2,4);
        g.addEdge(2,3);
        g.addEdge(4,3);
        g.addEdge(3,5);
        g.addEdge(5,6);
        g.BFS(1);
        g.DFS(1);
        g.printGraph();
    }
}
