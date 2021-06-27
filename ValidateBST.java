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
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }else{
            if(checklessvalue(root.left,root.val) && checkgreatervalue(root.right,root.val) && isValidBST(root.left) && isValidBST(root.right)){
                return true;
            }else{
                return false;
            }
        }
        
    }
    
    public boolean checklessvalue(TreeNode root,int value){
        if(root == null){
            return true;
        }else{
            if(root.val < value &&checklessvalue(root.left,value) && checklessvalue(root.right,value)){
                return true;
            }else{
                return false;
            }
        }
        
    }
    
    public boolean checkgreatervalue(TreeNode root,int value){
        if(root == null){
            return true;
        }else{
            if(root.val > value &&checkgreatervalue(root.left,value) && checkgreatervalue(root.right,value)){
                return true;
            }else{
                return false;
            }
        }
        
    }
}
