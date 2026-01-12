class MyLinkedList {
    class node
    {
        int val;
        node next;
        node(int val)
        {
            this.val=val;
            this.next=null;
        }
    }
public static node head;
public static node tail;
public int size;
    public MyLinkedList() {
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
         node temp=head;
        for(int i=0;i<index;i++)
            temp=temp.next;
        return temp.val;
    }
    
    public void addAtHead(int val) {
        node temp=new node(val);
        temp.next=head;
        head=temp;
        size++;
    }
    
    public void addAtTail(int val) {
        if (size == 0) {
            addAtHead(val);
            return;
        }
        node tai=new node(val);
        node temp=head;
        while(temp.next!=null)
        temp=temp.next;
        temp.next=tai;
        tail=tai;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return;
         node temp=new node(val);
         if (index <= 0) {
            addAtHead(val);
            return;
        }
        node curr=head;
        for(int i=0;i<index-1;i++)
        {
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
         node curr=head;
         if(index==0)
         head=head.next;
         else {
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */