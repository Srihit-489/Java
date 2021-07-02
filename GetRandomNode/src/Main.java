public class Main {
    public static void main(String[] args) {
       BinaryTree T = new BinaryTree();
       for(int i=1;i<10;i++){
           T.insert(T.root,i);
       }
       T.inorder(T.root);
       for(int i=0;i<5;i++){
           System.out.println("The random node is "+T.getRandomNode().data);
       }
    }
}
