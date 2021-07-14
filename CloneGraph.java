/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
       HashMap<Integer,Node> visited = new HashMap<>();
        Node newgraph =   dfs(node,visited);
        return newgraph;
    }
    
    public Node dfs(Node node,HashMap<Integer,Node> visited){
        Node newnode = new Node(node.val);
        visited.put(newnode.val,newnode);
        for(Node runner : node.neighbors){
            if(visited.keySet().contains(runner.val)){
                newnode.neighbors.add(visited.get(runner.val));
            }else{
                newnode.neighbors.add(dfs(runner,visited));
            }
        }
        return newnode;
        
    }
    
}
