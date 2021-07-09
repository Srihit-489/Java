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
    int count = 0;
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int height = getheight(root);
        count = (int)Math.pow(2,height-1);
        count = count-1;
        getleaves(root,0,height);
        return count;
    }
    
    public void getleaves(TreeNode root,int current,int height){
        if(root == null){
            return;
        }else if(root.left == null && root.right == null && current == height-1){
            count++;
            return;
        }
        
        
        getleaves(root.left,current+1,height);
        getleaves(root.right,current+1,height);
        
    }
    
    public int getheight(TreeNode root){
        if(root == null) return 0;
        else return 1+Math.max(getheight(root.left),getheight(root.right));
    }
}
