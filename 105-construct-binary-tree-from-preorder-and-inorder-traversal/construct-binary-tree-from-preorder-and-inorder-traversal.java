import java.util.HashMap;
import java.util.Map;
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inOrderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inOrderMap.put(inorder[i], i);
        }
        return split(preorder, inOrderMap, 0, 0, inorder.length - 1);
    }
    public TreeNode split(int[] preorder, Map<Integer, Integer> inOrderMap, int rootIdx, int left, int right) {
        TreeNode root = new TreeNode(preorder[rootIdx]);
        int mid = inOrderMap.get(preorder[rootIdx]);
        if (mid > left) {
            root.left = split(preorder, inOrderMap, rootIdx + 1, left, mid - 1);
        }
        if (mid < right) {
            root.right = split(preorder, inOrderMap, rootIdx + (mid - left) + 1, mid + 1, right);
        }
        return root;
    }
}