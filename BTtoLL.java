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
    public void flatten(TreeNode root) {
        List<TreeNode> mylist = new ArrayList<TreeNode>();
        preorder(root,mylist);
        for(int i=0;i<mylist.size() -1;i++){
            TreeNode current = mylist.get(i);
            TreeNode nextnode = mylist.get(i+1);
            current.left = null;
            nextnode.left = null;
            current.right = nextnode;
        }
    }
    
    public void preorder(TreeNode root,List<TreeNode> mylist){
        if(root == null){
            return;
        }else{
            mylist.add(root);
            preorder(root.left,mylist);
            preorder(root.right,mylist);
        }
    }
}
