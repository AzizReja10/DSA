/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        // Base case: If the list is empty
        if (head == null) return null;
        
        // Base case: If there is only one node, it becomes a leaf
        if (head.next == null) return new TreeNode(head.val);
        
        // 1. Find the middle node
        ListNode mid = findMiddle(head);
        
        // 2. The middle node becomes the root
        TreeNode root = new TreeNode(mid.val);
        
        // 3. Recurse for left and right halves
        // 'head' is now the start of the left half (since findMiddle disconnected it)
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        
        return root;
    }
    
    private ListNode findMiddle(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        
        // Fast moves twice as fast as slow
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Disconnect the left half from the middle node
        if (prev != null) {
            prev.next = null;
        }
        
        return slow;
    }
}