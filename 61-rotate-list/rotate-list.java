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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0||head==null||head.next==null)
        return head;
        ListNode temp=head;
        int size=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            size++;
        }
        temp.next=head;
        k=k%size;
        int length=size-k;
        ListNode last=temp;
        for(int i=0;i<length;i++)
        {
            last=last.next;
        }
        ListNode newhead=last.next;
        last.next=null;
        return(newhead);
    }
}