class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


class Solution {
    Node reverseList(Node head) {
        
        if(head == null || head.next == null)
        {
            return head;
        }
        
        Node currNode = head.next;
        Node prevNode = head;
        
        while(currNode != null)
        {
            Node nextNode = currNode.next;
            
            //update
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        
        head.next = null;
       // head = prevNode;
        
        return prevNode;
    }
    
}
