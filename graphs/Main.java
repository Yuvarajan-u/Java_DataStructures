package graphs;

public class Main {
    public static void main(String[] args) {
        Graph gp = new Graph();
        gp.addVertex("A");
        gp.addVertex("B");
        gp.addVertex("C");
        gp.addVertex("D");
        // the printed values will be in random order due to hashing concept
        System.out.println(gp.getAdjList());

        gp.addEdge("A", "B");
        gp.addEdge("A", "C");
        gp.addEdge("B", "C");
        gp.addEdge("A","D");
        gp.addEdge("B","D");
        gp.addEdge("C","D");

        System.out.println(gp.getAdjList());

        // gp.removeEdge("A", "B");
        // System.out.println(gp.getAdjList());

        gp.removeVertex("D");
        System.out.println(gp.getAdjList());
    }
}
