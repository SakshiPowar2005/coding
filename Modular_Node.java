/*node class of the linked list is as:
class Node {
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
    public int modularNode(Node head, int k) {
        
        if(head == null || head.next == null)
        {
            return -1;
        }
        
        int index = 0;
        Node curr = head;
        int maxnode = -1;
        while(curr != null)
        {
            index++;
            if(index % k == 0)
            {
                maxnode = curr.data;
            }
            
            curr = curr.next;
            
        }
        
        return maxnode;
    }
}
