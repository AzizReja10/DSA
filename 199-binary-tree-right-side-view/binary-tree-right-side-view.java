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
        List<Integer> l=new ArrayList<>();
        List<Integer> fin=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        right(root);
       return fin;
    }
    public void right(TreeNode root)
        {
         if(root==null)
        return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            TreeNode curr=q.remove();
            if(curr==null)
            {
            fin.add((l.remove(l.size()-1)));
            //c=0;
            if(q.isEmpty())
            break;
            else
            q.add(null);
        }
        else
         {
            //System.out.print(curr.data+" ");
            l.add(curr.val);
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);
          }
        }
        
    }
}