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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = buildTree(inorder,postorder,0,inorder.length-1,postorder.length-1);
        return root;
    }
    
    public TreeNode buildTree(int[] inorder,int[] postorder,int instart,int inend,int postindex){
        if(inend < instart){
            return null;
        }
        int parti = 0;
        for(int i=0;i<inorder.length;i++){
            if(postorder[postindex] == inorder[i]){
                parti = i;
            }
        }
        
        TreeNode root = new TreeNode(postorder[postindex]);
        root.left = buildTree(inorder,postorder,instart,parti-1,postindex-inend+parti-1);
        root.right = buildTree(inorder,postorder,parti+1,inend,postindex-1);
        return root;
        
    }
    
}
