import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private List<Vertex> neghibors;
    private boolean visited;

    public Vertex(String name){
        this.name = name;
        this.neghibors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vertex> getNeghibors() {
        return neghibors;
    }

    public void setNeghibors(List<Vertex> neghibors) {
        this.neghibors = neghibors;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
