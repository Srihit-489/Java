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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int balance = balance_factor(root);
        if( balance < 2 && balance > -2){
            return isBalanced(root.left) && isBalanced(root.right);
        }else{
            return false;
        }
    }
    
    public int balance_factor(TreeNode root){
        return  height(root.left) - height(root.right);
    }
    
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return 1+Math.max(height(root.left),height(root.right));
        }
    }
    
}
