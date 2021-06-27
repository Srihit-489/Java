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
    public void recoverTree(TreeNode root) {
        int swapper1;
        if(root == null){
            return;
        }
        if(mincheck(root.left,root.val) && maxcheck(root.right,root.val)){
            recoverTree(root.left);
            recoverTree(root.right);
        }else if(!mincheck(root.left,root.val)&& !maxcheck(root.right,root.val)){
            TreeNode maxval = maxvalue(root.left,root.val);
            TreeNode minval = minvalue(root.right,root.val);
            int temp = maxval.val;
            maxval.val = minval.val;
            minval.val = temp;
            return;
        }else if(!mincheck(root.left,root.val)){
            TreeNode maxval = maxvalue(root.left,root.val);
            int temp = root.val;
            root.val = maxval.val;
            maxval.val = temp;
            return;
        }else{
            TreeNode minval = minvalue(root.right,root.val);
            int temp = root.val;
            root.val = minval.val;
            minval.val = temp;
            return;
        }
        
    }
    
    public TreeNode minvalue(TreeNode root,int value){
        if(root.val < value){
            return root;
        }else{
            return minvalue(root.left,value);
        }
    }
    
    public TreeNode maxvalue(TreeNode root,int value){
        if(root.val > value){
            return root;
        }else{
            return maxvalue(root.right,value);
        }
    }
    
    public boolean mincheck(TreeNode root,int value){
        if(root == null){
            return true;
        }
        if(root.val < value){
            if(mincheck(root.left,value) && mincheck(root.right,value)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
        
    }
    
    public boolean maxcheck(TreeNode root,int value){
        if(root == null){
            return true;
        }
        if(root.val > value){
            if(maxcheck(root.left,value) && maxcheck(root.right,value)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
        
    }
}
