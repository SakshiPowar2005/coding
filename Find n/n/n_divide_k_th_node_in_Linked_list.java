/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public static int fractional_node(Node head, int k) {
        
        int count = 0;
        Node curr = head;
        
        while(curr != null)
        {
            count++;
            curr = curr.next;
        }
        
        curr = head;
        Node prev = null;
        int result = (int) Math.ceil((double) count / k);
        
        while(curr != null && result != 0)
        {
            prev = curr;
            curr = curr.next;
            result--;
        }
        
        return prev.data;
    }
}
