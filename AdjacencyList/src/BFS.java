import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void traverse(Vertex source){
        Queue<Vertex> myqueue = new LinkedList<>();
        myqueue.add(source);
        while(!myqueue.isEmpty()){

            Vertex actual = myqueue.remove();
            actual.setVisited(true);
            System.out.println("Current Node is "+actual.getName());
            for(Vertex v : actual.getAdjacencylist()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    myqueue.add(v);
                }
            }


        }

    }
}
