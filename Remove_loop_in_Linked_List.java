/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static boolean removeLoop(Node head) {
        // code here
        
        Node slow = head;
        Node fast = head;
        boolean isboolean = false;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            {
                isboolean = true;
                break;
            }
        }
        if(!isboolean) return false;
        
        slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        Node ptr = slow;
        while(ptr.next != slow)
        {
            ptr = ptr.next;
        }
        
        ptr.next = null;
        
        return true;
    }
}
