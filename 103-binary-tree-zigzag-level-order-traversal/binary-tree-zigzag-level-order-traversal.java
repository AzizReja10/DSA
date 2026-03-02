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
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
          if (root == null) 
            return l;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean lr=true;
        while (!q.isEmpty()) 
        {
            int levelSize = q.size();
            LinkedList<Integer> cl = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.remove();
                if(lr)
                cl.add(curr.val); 
                else
                cl.addFirst(curr.val);
                if (curr.left != null) 
                q.add(curr.left);
                if (curr.right != null) 
                q.add(curr.right);
            }
            l.add(cl);
            lr=!lr;
        }
        return l;
    }
}