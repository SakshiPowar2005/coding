/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        
        if(head == null) return -1;
        
        Node node = head;
        int index = 0;
        while(node != null)
        {
            index++;
            node = node.next;
        }
        
        node = head;
        int mid = index / 2;
        for(int i = 0; i < mid; i++)
        {
            
            node = node.next;
        }
        
        return node.data;
        
    }
}
