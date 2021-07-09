/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        List<List<Node>> mylist = new ArrayList<>();
        getlevelorder(root,mylist,0);
        for(List<Node> templist : mylist){
            for(int i=0;i<templist.size()-1;i++){
                Node tempNode = templist.get(i);
                tempNode.next = templist.get(i+1);
            }
            templist.get(templist.size()-1).next = null;
        }
        return root;
        
    }
    
    public void getlevelorder(Node root,List<List<Node>> mylist,int level){
        if(root == null){
            return;
        }
        if(mylist.size() <= level){
            mylist.add(new ArrayList<Node>());
        }
        
        mylist.get(level).add(root);
        getlevelorder(root.left,mylist,level+1);
        getlevelorder(root.right,mylist,level+1);
        
    }
    
    
}
