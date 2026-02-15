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
    public boolean hasPathSum(TreeNode root, int targetSum) {
         if(root==null)
        return false;
      Stack<TreeNode> n= new Stack<>();
      Stack<Integer> sum=new Stack<>();
      n.push(root);
      sum.push(root.val);
      while(!n.isEmpty())
      {
        TreeNode temp=n.pop();
        int tempVal=sum.pop();
        if(temp.left==null&&temp.right==null&&tempVal==targetSum)
        return true;
        if(temp.left!=null)
        {
            n.push(temp.left);
            sum.push(tempVal+temp.left.val);
        }
        if(temp.right!=null)
        {
            n.push(temp.right);
            sum.push(tempVal+temp.right.val);
        }
      }
      return false;
    }
}