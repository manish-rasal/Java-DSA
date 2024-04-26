package datastructures.graph;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addEdge("A", "B");
        myGraph.addEdge("C", "B");
        myGraph.addEdge("A", "C");
        myGraph.printGraph();
        myGraph.removeEdge("A", "B");
        myGraph.printGraph();
        myGraph.removeVertex("A");
        myGraph.printGraph();

    }
}
