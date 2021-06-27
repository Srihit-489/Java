/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> inorderp = new ArrayList<Integer>();
        inorder(p,inorderp);
        ArrayList<Integer> inorderq = new ArrayList<Integer>();
        inorder(q,inorderq);
        if(!inorderp.equals(inorderq)){
            return false;
        }
        ArrayList<Integer> preorderp = new ArrayList<Integer>();
        preorder(p,preorderp);
        ArrayList<Integer> preorderq = new ArrayList<Integer>();
        preorder(q,preorderq);
        if(!preorderp.equals(preorderq)){
            return false;
        }
        ArrayList<Integer> postorderp = new ArrayList<Integer>();
        postorder(p,postorderp);
        ArrayList<Integer> postorderq = new ArrayList<Integer>();
        postorder(q,postorderq);
        if(!postorderp.equals(postorderq)){
            return false;
        }
        return true;
        
    }
    
    public void preorder(TreeNode root,ArrayList<Integer> mylist){
        if(root == null){
            mylist.add(0);
            return;
        }else{
            mylist.add(root.val);
            preorder(root.left,mylist);
            preorder(root.right,mylist);
        }
    }
    
    public void inorder(TreeNode root,ArrayList<Integer> mylist){
        if(root == null){
           mylist.add(0);
            return;
        }else{
            inorder(root.left,mylist);
            mylist.add(root.val);
            inorder(root.right,mylist);
        }
    }
    
    public void postorder(TreeNode root,ArrayList<Integer> mylist){
        if(root == null){
            mylist.add(0);
            return;
        }else{
            postorder(root.left,mylist);
            postorder(root.right,mylist);
            mylist.add(root.val);
        }
    }
}
