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
    public ListNode mergeNodes(ListNode head) {
         ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        ListNode first=head;
        ListNode last=head.next;
        int sum=0;
        while(last!=null)
        {
            if(last.val!=0)
            {
                sum+=last.val;
            }
            else
            {
                curr.next=new ListNode(sum);
                curr=curr.next;
                sum=0;
                head=last;
            }
            last=last.next;
        }
        return(dummy.next);
    
    }
}