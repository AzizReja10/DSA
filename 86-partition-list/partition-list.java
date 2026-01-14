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
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(0);
        ListNode higher=new ListNode(0);
        ListNode SH=small,LH=higher;
        while(head!=null)
        {
            if(head.val<x)
            {
              SH.next=head;
              SH=SH.next;
            }
            else
            {
                 LH.next=head;
                 LH=LH.next;
            }
            head=head.next;
        }
        LH.next=null;
        SH.next=higher.next;
      
        return small.next;
        
    }
}