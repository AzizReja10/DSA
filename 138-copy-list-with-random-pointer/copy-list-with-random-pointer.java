/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Create interleaved nodes
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Assign random pointers for the copies
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                // The copy's random is the copy of the original's random
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate the two lists
        curr = head;
        Node dummy = new Node(0);
        Node copyCurr = dummy;
        
        while (curr != null) {
            // Extract the copy
            copyCurr.next = curr.next;
            copyCurr = copyCurr.next;
            
            // Restore the original list
            curr.next = curr.next.next;
            curr = curr.next;
        }

        return dummy.next;
    }
}