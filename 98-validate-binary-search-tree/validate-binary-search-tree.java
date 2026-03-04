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
 boolean b=true;
    TreeNode prev=null;
    public boolean isValidBST(TreeNode root) {
        build(root);
        return b;
    }

    public void build(TreeNode root)
    {
         if(root==null||!b)
        return;
       build(root.left);
       if(prev!=null&&prev.val>=root.val)
       {
         b=false;
         return;
       }
        prev=root;
       build(root.right);
    }
}