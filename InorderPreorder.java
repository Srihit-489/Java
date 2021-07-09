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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode  root = gettree(preorder,inorder,0,inorder.length-1,0);
        return root;
    }
    
    public TreeNode gettree(int[] preorder,int[] inorder,int instart,int inend,int preindex){
        if(instart > inend){
            return null;
        }
        int rootval = preorder[preindex];
        TreeNode root = new TreeNode(rootval);
        int partition = 0;
        for(int i=instart;i<=inend;i++){
            if(rootval == inorder[i]){
                partition = i;
                break;
            }
        }
        
        root.left = gettree(preorder,inorder,instart,partition-1,preindex+1);
        root.right = gettree(preorder,inorder,partition+1,inend,preindex+partition-instart+1);
        return root;

    }
    
}
