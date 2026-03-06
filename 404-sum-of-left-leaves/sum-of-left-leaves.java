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
    public int sumOfLeftLeaves(TreeNode root) {
        return process(root, false);
    }

    private int process(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }

        // Check if it's a leaf node
        if (node.left == null && node.right == null) {
            // Return value only if it's a LEFT leaf
            return isLeft ? node.val : 0;
        }

        // Recurse left (isLeft = true) and right (isLeft = false)
        return process(node.left, true) + process(node.right, false);
    }
}