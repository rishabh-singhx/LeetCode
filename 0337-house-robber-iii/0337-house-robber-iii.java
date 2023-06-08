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
    //Tree with DP
    //hashmap -kry node is key
    public int rob(TreeNode root) {
        if(root==null) return 0;
        HashMap<TreeNode,Integer> map=new HashMap<>();
        return H_rob(root,map);
    }
    
    public int H_rob(TreeNode root,HashMap<TreeNode,Integer> map) {
        if(root==null) return 0;
        
        if(map.containsKey(root)) return map.get(root);
        int rob=root.val;
        if(root.left!=null){
            rob+=H_rob(root.left.left,map)+H_rob(root.left.right,map);
        }
        
        if(root.right!=null){
            rob+=H_rob(root.right.left,map)+H_rob(root.right.right,map);
        }
        int dontrob=H_rob(root.right,map)+H_rob(root.left,map);
        int ans=Math.max(rob,dontrob);
        map.put(root,ans);
        return ans;
    }
}