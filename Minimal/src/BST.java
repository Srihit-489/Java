public class BST {
    public Node root;



    public class Node{
        private int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public int getData() {
            return data;
        }
    }
}
