/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public boolean isSorted(Node head) {
        
        if(head == null || head.next == null)
        {
            return true;
        }
        Node curr = head;
        
        while(curr.next != null && curr.data == curr.next.data)
        {
            curr = curr.next;
        }
        
        if(curr.next == null)
        {
            return true;
        }
        
        boolean incresing = curr.data < curr.next.data;
        curr = curr.next;
        
        while(curr.next != null)
        {
            if(incresing && curr.data > curr.next.data)
            {
                return false;
            }
            if(!incresing && curr.data < curr.next.data)
            {
                return false;
            }
            
            curr = curr.next;
        }
        
        return true;
    }
}
