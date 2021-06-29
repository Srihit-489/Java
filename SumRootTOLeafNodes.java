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
    public int sumNumbers(TreeNode root) {
        List<Integer> mylist = new ArrayList<Integer>();
        getnumlist(root,mylist,"");
        int sum=0;
        for(int i=0;i<mylist.size();i++){
            sum = sum + mylist.get(i);
        }
        return sum;
    }
    public void getnumlist(TreeNode root,List<Integer> mylist,String currentString){
        if(root.left == null && root.right == null){
            String finalString = currentString + root.val;
            mylist.add(Integer.parseInt(finalString));
        }
        currentString = currentString+root.val;
        String duplicate = new String(currentString);
        if(root.left != null){
            getnumlist(root.left,mylist,currentString);
        }
        if(root.right != null){
            getnumlist(root.right,mylist,duplicate);
        }
        
        
    }
}
