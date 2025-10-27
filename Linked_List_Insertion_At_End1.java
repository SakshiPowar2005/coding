/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        
        Node curr = head;
        Node temp = new Node(x);
        
        if(head == null)
        {
            return temp;
        }
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = null;
        
        return head;
    }
}
