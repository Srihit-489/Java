import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        List<Vertex> graph = new ArrayList<Vertex>();
        graph.add(new Vertex("0"));
        graph.add(new Vertex("1"));
        graph.add(new Vertex("2"));
        graph.add(new Vertex("3"));
        graph.add(new Vertex("4"));
        graph.add(new Vertex("5"));
        graph.get(3).getNeghibors().add(graph.get(1));
        graph.get(4).getNeghibors().add(graph.get(1));
        graph.get(4).getNeghibors().add(graph.get(0));
        graph.get(5).getNeghibors().add(graph.get(0));
        graph.get(5).getNeghibors().add(graph.get(2));
        graph.get(2).getNeghibors().add(graph.get(3));
        TopologicalOrdering topo = new TopologicalOrdering();
        for(int i=0;i<graph.size();i++){
            if(!graph.get(i).isVisited()){
                topo.dfs(graph.get(i));
            }
        }

        Stack<Vertex> mystack = topo.getstact();
        for(int i=0;i<graph.size();i++){
            Vertex myvertex = mystack.pop();
            System.out.println(myvertex.getName());
        }

    }
}
