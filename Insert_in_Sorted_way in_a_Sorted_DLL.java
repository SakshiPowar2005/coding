/*class of the node of the DLL is as
/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        
        Node newnode = new Node(x);
        if(head == null)
        {
            return newnode;
        }
        
        //insert at begining
        if(x < head.data)
        {
            newnode.next = head;
            head.prev = newnode;
            return newnode;
            
        }
        
        Node curr = head;
        //insert in middle or end
        while(curr.next != null && curr.next.data < x)
        {
            curr = curr.next;
        }
        
        newnode.next = curr.next;
        newnode.prev = curr;
        
        if(curr.next != null)
        {
            curr.next.prev = newnode;
        }
        
        curr.next = newnode;
        return head;

    }
}
