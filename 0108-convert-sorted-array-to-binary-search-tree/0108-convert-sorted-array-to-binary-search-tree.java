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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums,0,nums.length-1);
    }
    public TreeNode createTree(int nums[],int si,int ei){
        if(si>ei)
            return null;
        int mid=(si+ei)/2;
        TreeNode n =new TreeNode();
        n.val = nums[mid];
        n.left = createTree(nums,si,mid-1);
        n.right = createTree(nums,mid+1,ei);
        return n;
    }
}