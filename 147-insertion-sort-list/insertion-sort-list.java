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
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode temp = head.next;   // start from second node
        head.next = null;            // sorted list starts with head

        while (temp != null) {
            ListNode next = temp.next;  // save next node
            ListNode start = head;
            ListNode prev = null;

            // find insertion position
            while (start != null && start.val <= temp.val) {
                prev = start;
                start = start.next;
            }

            // insert at beginning
            if (prev == null) {
                temp.next = head;
                head = temp;
            }
            // insert in middle or end
            else {
                prev.next = temp;
                temp.next = start;
            }

            temp = next; // move to next node
        }
        return head;
    }
}
