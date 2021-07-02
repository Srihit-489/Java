public class Main {
    public static void main(String[] args) {
        int[] myarray = new int[]{3,4,5,6,7,8,9,10,11,12};
        BST.Node mytree =  insertUsingArray(myarray,0,myarray.length-1);
        inorder(mytree);
        System.out.println();
        preorder(mytree);
    }

    public static void preorder(BST.Node root){
        if(root == null){
            return;
        }
        System.out.print(root.getData()+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(BST.Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.getData()+" ");
        inorder(root.right);
    }

    public static BST.Node insertUsingArray(int[] myarray,int low,int high){
        if(low > high){
            return null;
        }
        int mid = (low+high)/2;
        BST.Node result = new BST().new Node(myarray[mid]);
        result.left = insertUsingArray(myarray,low,mid-1);
        result.right = insertUsingArray(myarray,mid+1,high);
        return result;
    }

    public static void insert(BST.Node root,int data){
        if(root == null){
            root = new BST().new Node(data);
            return;
        }
        if(data <= root.getData()){
            insert(root.left,data);
        }else{
            insert(root.right,data);
        }

    }

}
