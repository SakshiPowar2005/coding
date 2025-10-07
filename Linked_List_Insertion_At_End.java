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
        // code here
        
        Node node = head;
        // Node next = null;
        Node newNode = new Node(x);
        if(head == null) //empty list
        {
            return newNode; // create first node
        }
        
        while(node.next != null)
        {
            node =  node.next;
        }
        
        node.next = newNode;
        // newNode.next = null;
        
        return head;
    }
}
