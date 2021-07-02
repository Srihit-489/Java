import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public Node root;
    private List<Node> mylist;
    public BinaryTree(){
        root = null;
        mylist = new ArrayList<Node>();
    }

    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public void  insert(Node root,int data){
        if(root == null){
            root = new Node(data);
            mylist.add(root);
            return;
        }
        if(root.data >= data){
             insert(root.left,data);
        }else{
            insert(root.right,data);
        }
    }

    public Node getRandomNode(){
        return mylist.get((int)(Math.random()*mylist.size()));
    }



    public class Node{
        public int data;
        public Node left;
        public Node right;
        public Node(int data){
            this.data = data;
            this.right = right;
            this.left = left;
        }
    }
}
