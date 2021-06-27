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
    public List<TreeNode> generateTrees(int n) {
        if(n == 0){
            return new ArrayList<TreeNode>();
        }else{
            List<TreeNode> mylist = new ArrayList<TreeNode>();
            mylist = getpermute(1,n);
            return mylist;
        }
        
    }
    public ArrayList<TreeNode> getpermute(int start,int end){
        ArrayList<TreeNode> mylist = new ArrayList<TreeNode>();
        if(start > end){
            mylist.add(null);
            return mylist;
        }
        for(int i=start;i<=end;i++){
            ArrayList<TreeNode> left = getpermute(start,i-1);
            ArrayList<TreeNode> right = getpermute(i+1,end);
            for(TreeNode leftside : left){
                for(TreeNode rightside : right){
                    TreeNode root = new TreeNode(i);
                    root.left = leftside;
                    root.right = rightside;
                    mylist.add(root);
                }
            }
        }
        return mylist;
    }
}
