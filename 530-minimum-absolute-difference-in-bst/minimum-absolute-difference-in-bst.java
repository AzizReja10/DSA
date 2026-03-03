class Solution {
    private Integer prev = null;
    private int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        prev = null;
        min = Integer.MAX_VALUE;
        inorder(root);
        return min;
    }
    private void inorder(TreeNode root) {
        if (root == null) 
        return;
        inorder(root.left);
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val; 
        inorder(root.right);
    }
}