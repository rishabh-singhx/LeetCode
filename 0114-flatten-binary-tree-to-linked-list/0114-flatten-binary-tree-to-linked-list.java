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
    List<TreeNode> pre;
    public void flatten(TreeNode root) {
        pre = new ArrayList<>();
        preOrder(root);
        flattenTree(root,pre,1);
        return;
    }
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        pre.add(root);
        preOrder(root.left);
        preOrder(root.right);
    }
    public void flattenTree(TreeNode root,List<TreeNode> pre, int i){
        if(root==null)
            return;
        if(pre.size()==i)
            return;
        root.left = null;
        root.right = pre.get(i);
        flattenTree(root.right,pre,i+1);
    }
}