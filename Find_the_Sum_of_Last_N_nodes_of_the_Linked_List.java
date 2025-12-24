/*
Node class is as follows:

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        
        Node curr = head;
        int length = 0;
        
        while(curr != null)
        {
            length++;
            curr = curr.next;
        }
        
        curr = head;
        for(int i = 0; i < length - n; i++)
        {
            curr = curr.next;
        }
        
        int sum = 0;
        
        while(curr != null)
        {
            sum += curr.data;
            curr = curr.next;
        }
        
        return sum;
    }
}
