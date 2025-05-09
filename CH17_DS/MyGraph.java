package CH17_DS;

import java.util.*;
public class MyGraph {

    Map<Integer,Node> m = new HashMap<>();

    public boolean addVertex(int v) {
        if(!m.containsKey(v)) {
            m.put(v, new Node(v));
            return true;
        }
        System.out.println("the vertex already exists");
        return false;
    }

    public boolean addEdge(int a, int b) {
        if(!m.containsKey(a) || !m.containsKey(b)) {
            System.out.println("some vertex is not present in the graph");
            return false;
        }else if(m.get(a).neighbours.contains(m.get(b))) {
            System.out.println("the edge already exists");
            return false;
        }else {
            Node n1 = m.get(a);
            Node n2 = m.get(b);
            m.get(a).neighbours.add(n2);
            m.get(b).neighbours.add(n1);
            return true;
        }
    }

    public void BFS(int s) {

        Queue<Node> q = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        q.add(m.get(s));
        visited.add(s);


        while(!q.isEmpty()) {

            Node current = q.poll();
            System.out.println("the data in the edge is = "+current.data);

            for(Node a : current.neighbours) {
                if(!visited.contains(a.data)) {
                    q.add(a);
                    visited.add(a.data);

                }
            }
        }
    }

    public void DFS(int s) {

        ArrayDeque<Node> q = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        q.push(m.get(s));
        visited.add(s);


        while(!q.isEmpty()) {

            Node current = q.poll();
            System.out.println("the data in the edge is = "+current.data);

            for(Node a : current.neighbours) {
                if(!visited.contains(a.data)) {
                    q.add(a);
                    visited.add(a.data);

                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyGraph G = new MyGraph();

        System.out.println("1:create a graph 2:perform BFS 3:perform DFS 4:exit");

        while(true) {

            int a = sc.nextInt();

            switch(a) {
                case 1:
                    G.addVertex(1);
                    G.addVertex(2);
                    G.addVertex(3);
                    G.addVertex(4);
                    G.addVertex(5);
                    G.addVertex(6);

                    G.addEdge(1,2);
                    G.addEdge(1,4);
                    G.addEdge(2,4);
                    G.addEdge(2,3);
                    G.addEdge(4,3);
                    G.addEdge(5,3);
                    G.addEdge(5,6);
                    break;
                case 2:
                    System.out.println("Bfs traversal");
                    G.BFS(1);
                    break;

                case 3:
                    System.out.println("Dfs traversal");
                    G.DFS(1);
                    break;
                case 4:
                    System.out.println("all done");
                    System.exit(0);

            }

        }








    }

}

