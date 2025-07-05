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
    public int minDepth(TreeNode root) {
        return depth(root);
    }
     public int depth(TreeNode root){
        if(root==null)
            return 0;
        if(root.left==null)
            return depth(root.right)+1;
        if(root.right==null)
            return depth(root.left)+1;
        int lh=depth(root.left);
        int rh=depth(root.right);
        return Math.min(lh,rh)+1;
    }
}