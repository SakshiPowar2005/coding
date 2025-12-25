class Solution {
    public Node removeAllDuplicates(Node head) {
        
        if(head == null || head.next == null)
        {
            return head;
        }
        
        Node curr = head;
        Node dummynode = new Node(-1);
        Node prev = dummynode;
        dummynode.next = head;
        
        while(curr != null)
        {
            boolean isduplicate = false;
           while(curr.next != null && curr.data == curr.next.data)
           {
               isduplicate = true;
               curr = curr.next;
           }
           
           //duplicate found
           if(isduplicate)
           {
               prev.next = curr.next;
           }
           else
           {
               prev = prev.next;
           }
           
           curr = curr.next;
        }
        
        return dummynode.next;
       
    }   
}
