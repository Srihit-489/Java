

public class DFS {
//    Stack<Vertex> stack;
//    public DFS(){
//        this.stack = new Stack<>();
//    }

    public void dfs(Vertex root){
//        stack.push(root);
//        root.setVisited(true);
        root.setVisited(true);
        System.out.print(root.getName()+" ");
//        while(!stack.empty()){
//            Vertex current = stack.pop();
//            System.out.print(current.getName()+" ");
            for(Vertex vertex : root.getAdjacencylist()){
                if(!vertex.isVisited()){
                    dfs(vertex);
//                    stack.push(vertex);
//                    vertex.setVisited(true);
                }
            }
        //}
    }
}
