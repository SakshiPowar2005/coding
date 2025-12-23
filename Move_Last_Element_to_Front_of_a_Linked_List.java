/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

*/

class Solution {
    public static Node moveToFront(Node head) {
        
        if(head == null || head.next == null)
        {
            return head;
        }
        
        Node curr = head;
        Node prev = curr;
        while(curr.next != null)
        {
            prev = curr;
            curr = curr.next;
        }
        
        Node temp = new Node(curr.data);
        prev.next = null;
        temp.next = head;
        return temp;
    }
}
