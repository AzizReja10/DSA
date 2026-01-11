/**
 * Definition for singly-linked list.
 * 
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode curr=head;
        while(curr!=null)
        {
            if(curr.next!=null&&curr.val==curr.next.val)
            {
                while(curr.next!=null&&curr.val==curr.next.val)
                curr=curr.next;
                pre.next=curr.next;
            }
            else
             pre=pre.next;
            curr=curr.next;
        }
        return(dummy.next);
    }
}