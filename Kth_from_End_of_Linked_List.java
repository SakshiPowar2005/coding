/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    int getKthFromLast(Node head, int k) {
        
        Node node = head;
        int count = 0;
        while(node != null)
        {
            node = node.next;
            count++;
            
        }
        
        int index = count - k;
        if(index < 0)
        {
            return -1;
        }
        
        node = head;
        for(int i = 0; i < index; i++)
        {
            node = node.next;
        }
        
        return node.data;
    }
}
