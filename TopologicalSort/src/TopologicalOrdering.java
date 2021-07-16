import java.util.Stack;

public class TopologicalOrdering {
    private Stack<Vertex> mystack;
    public TopologicalOrdering(){
        this.mystack = new Stack<>();
    }
    public void dfs(Vertex current){
        current.setVisited(true);
        for(Vertex i : current.getNeghibors()){
            if(!i.isVisited()){
                dfs(i);
            }
        }
        mystack.add(current);
    }

    public Stack getstact(){
        return mystack;
    }


}
