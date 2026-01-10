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
    public static ListNode head2;
    public static ListNode tail2;
    public ListNode reverseBetween(ListNode head, int left, int right) {
       ListNode dummy=new ListNode(0);
       dummy.next=head;
       ListNode leftN=dummy;
       ListNode curr=head;
       for(int i=0;i<left-1;i++)
       {
        leftN=leftN.next;
        curr=curr.next;
       }
       ListNode marker=curr;
       ListNode pre=null;
         for (int i = 0; i <= right - left; i++) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        leftN.next = pre;
        marker.next = curr;
       return dummy.next;
    }
}