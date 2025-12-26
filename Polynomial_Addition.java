/*class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}*/

// Print the polynomial formed by adding both LL in the function itself.
class Solution {
    public static Node addPolynomial(Node head1, Node head2) {
        
        Node dummy = new Node(0,0);
        Node curr = dummy;
        
        Node temp1 = head1;
        Node temp2 = head2;
        
        while(temp1 != null && temp2 != null)
        {
            if(temp1.pow > temp2.pow)
            {
                curr.next = new Node(temp1.coeff, temp1.pow);
                temp1 = temp1.next;
            }
            else if(temp1.pow < temp2.pow)
            {
                curr.next = new Node(temp2.coeff, temp2.pow);
                temp2 = temp2.next;
            }
            else
            {
                int sumoflist = temp1.coeff + temp2.coeff;
                if(sumoflist != 0)
                {
                    curr.next = new Node(sumoflist, temp1.pow);
                }
                
                temp1 = temp1.next;
                temp2 = temp2.next;
                
            }    
                
            if(curr != null)
            {
                curr = curr.next;
            }
        }
        
        while(temp1 != null)
        {
            curr.next = new Node(temp1.coeff, temp1.pow);
            curr = curr.next;
            temp1 = temp1.next;
        }
        
        while(temp2 != null)
        {
            curr.next = new Node(temp2.coeff, temp2.pow);
            curr = curr.next;
            temp2 = temp2.next;
        }
        
        return dummy.next;
        
    }
}
