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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = null;
        for(int i=0;i<nums.length;i++){
            root = insert(root,nums[i]);
        }
        return root;
    }
    
    public TreeNode insert(TreeNode root,int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(root.val < value){
            root.right = insert(root.right,value);
        }else{
            root.left = insert(root.left,value);
        }
        if(balance_factor(root) > 1){
            return left_rotate(root);
        }
        
        if(balance_factor(root) < -1){
            return right_rotate(root);
        }
        
        return root;
    }
    
    public TreeNode left_rotate(TreeNode root){
        TreeNode newroot = root.left;
        root.left = newroot.right;
        newroot.right = root;
        return newroot;
    }
    
    public TreeNode right_rotate(TreeNode root){
        TreeNode newroot = root.right;
        root.right = newroot.left;
        newroot.left = root;
        return newroot;
    }
    
    
    public int balance_factor(TreeNode root){
        return height(root.left) - height(root.right);
    }
    
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return 1 + Math.max(height(root.left),height(root.right));
        }
    }
}
