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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> mylist = new ArrayList<List<Integer>>();
        targetsumpath(root,targetSum,mylist,new ArrayList<Integer>(),0);
        return mylist;
    }
    
     public void targetsumpath(TreeNode root,int targetSum,List<List<Integer>> mylist,List<Integer> currentlist,int sum){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null ){
            if(root.val + sum == targetSum){
                currentlist.add(root.val);
                mylist.add(currentlist);
                return;
            }else{
                return;
            }
        }else{
            currentlist.add(root.val);
            ArrayList<Integer> newlist = new ArrayList<Integer>(currentlist);
            
           targetsumpath(root.left,targetSum,mylist,currentlist,root.val + sum);      
           targetsumpath(root.right,targetSum,mylist,newlist,root.val + sum);
            
        }
        
    }
    
    
}
