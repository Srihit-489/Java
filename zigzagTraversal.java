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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int height = getheight(root);
        ArrayList[] mylist  = new ArrayList[height];
        for(int i=0;i<height;i++){
            mylist[i] = new ArrayList();
        }
        getLevelorder(root,mylist,0);
        List finallist = new ArrayList();
        for(int i=0;i<height;i++){
            if(i%2 == 0){
                finallist.add(mylist[i]);
            }else{
                Collections.reverse(mylist[i]);
                finallist.add(mylist[i]);
            }
            
        }
        return finallist;
        
    }
    
   public void getLevelorder(TreeNode root,ArrayList[] mylist,int height){
        if(root == null){
            return;
        }
        mylist[height].add(root.val);
        getLevelorder(root.left,mylist,height+1);
        getLevelorder(root.right,mylist,height+1);
    }
    
    
    public int getheight(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return 1 + Math.max(getheight(root.left),getheight(root.right));
        }
    }
}
