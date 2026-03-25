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
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node to handle the new head of the list easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy, next = dummy, prev = dummy;
        int count = 0;

        // Count total nodes in the list
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        // While there are at least k nodes left to reverse
        while (count >= k) {
            curr = prev.next; // The first node of the group
            next = curr.next; // The second node of the group
            
            // Standard reversal for k-1 links within the group
            for (int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            
            prev = curr; // Move prev to the end of the reversed group
            count -= k;
        }

        return dummy.next;
    }
}