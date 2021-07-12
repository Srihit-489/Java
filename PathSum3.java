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
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        return getcountnumber(root,targetSum) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
    }
    
    public int getcountnumber(TreeNode root,int targetsum){
        if(root == null) return 0;
        return (root.val == targetsum?1:0) + getcountnumber(root.left,targetsum - root.val) + getcountnumber(root.right,targetsum - root.val);
    }
}
