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
        //return depth(root);
        return depth2(root);
    }

    //Better approach
    public int depth2(TreeNode root){
        if(root==null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int depth=1;
        q.add(root);
        while(!q.isEmpty()){
            int size_of_q=q.size();
            for(int i=0;i<size_of_q;i++){
                TreeNode rv=q.poll(); //remove rode
                if(rv.left == null && rv.right==null)
                    return depth;
                if(rv.left!=null)
                    q.add(rv.left);
                if(rv.right!=null)
                    q.add(rv.right);
            }
            depth++;
        }
        return depth;
    }


    //  public int depth(TreeNode root){
    //     if(root==null)
    //         return 0;
    //     if(root.left==null)
    //         return depth(root.right)+1;
    //     if(root.right==null)
    //         return depth(root.left)+1;
    //     int lh=depth(root.left);
    //     int rh=depth(root.right);
    //     return Math.min(lh,rh)+1;
    // }
}