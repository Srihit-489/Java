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
    public List<Integer> rightSideView(TreeNode root) {
        int height = getheight(root);
        List<Integer>[] levelorder = new ArrayList[height];
        for(int i=0;i<height;i++){
            levelorder[i] = new ArrayList<Integer>();
        }
        getlevellist(root,levelorder,0);
        List<Integer> finallist = new ArrayList<Integer>();
        for(int i=0;i<height;i++){
            finallist.add(levelorder[i].get(levelorder[i].size()-1));
        }
        return finallist;
    }
    
    public void getlevellist(TreeNode root,List[] levellist,int height){
        if(root == null){
            return;
        }
        levellist[height].add(root.val);
        getlevellist(root.left,levellist,height+1);
        getlevellist(root.right,levellist,height+1);
    }
    
    public int getheight(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return 1+Math.max(getheight(root.left),getheight(root.right));
        }
    }
}
