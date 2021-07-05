public class Main {
    public static void main(String[] args) {
        Graph mygraph = new Graph(5);
        mygraph.addVertex();
        mygraph.addEdge(0,1);
        mygraph.addEdge(0,2);
        mygraph.addEdge(1,2);
        mygraph.addEdge(2,3);
        mygraph.addEdge(2,4);
        mygraph.addEdge(1,4);
        mygraph.addEdge(3,5);
        mygraph.printGraph();
        mygraph.getdfs();
        System.out.println();
        mygraph.getbfs();
    }
}
