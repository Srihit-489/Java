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
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return targetsumpath(root,targetSum,0);
        
    }
    
    public boolean targetsumpath(TreeNode root,int targetSum,int sum){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null ){
            if(root.val + sum == targetSum){
                return true;
            }else{
                return false;
            }
        }else{
            return targetsumpath(root.left,targetSum,root.val + sum) || targetsumpath(root.right,targetSum,root.val+sum);
        }
        
    }
}
