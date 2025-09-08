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
    List<List<Integer>> ans;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans  = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        hasPathSum(root,targetSum,ll);
        return ans;
    }

    public void hasPathSum(TreeNode root, int targetSum,List<Integer> ll){
        if (root == null) {
            return ;
        }

        ll.add(root.val);
        if (root.left == null && root.right == null) {
            if (targetSum - root.val == 0){
                ans.add(new ArrayList<>(ll));
            }
        }else {
            hasPathSum(root.left, targetSum - root.val, ll);
            hasPathSum(root.right, targetSum - root.val, ll);
        }
        ll.remove(ll.size() - 1);
    }
}