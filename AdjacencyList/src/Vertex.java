import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private List<Vertex> adjacencylist;
    private boolean visited;

    public String getName() {
        return name;
    }
    public void setVisited(boolean visited){
        this.visited = visited;
    }

    public List<Vertex> getAdjacencylist() {
        return adjacencylist;
    }

    public boolean isVisited() {
        return visited;
    }

    public Vertex(String name){
        this.name = name;
        adjacencylist = new ArrayList<>();
        visited = false;
    }

    public void addneghibor(Vertex newvertex){
        adjacencylist.add(newvertex);
    }

    public void showneghibors(){
        for(Vertex v : adjacencylist){
            System.out.print(v.name+" ");
        }
        System.out.println();
    }
}
