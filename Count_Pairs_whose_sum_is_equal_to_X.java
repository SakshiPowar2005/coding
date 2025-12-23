// your task is to complete this function

/*class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int countPairs(Node head1, Node head2, int x) {
        
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        Node temp1 = head1;

        // Store all values of first list
        while(temp1 != null)
        {
            set.add(temp1.data);
            temp1 = temp1.next;
        }

        // Check pairs with second list
        Node temp2 = head2;
        while(temp2 != null)
        {
            if(set.contains(x - temp2.data))
            {
                count++;
            }
            
            temp2 = temp2.next;
        }
        
        return count;
    }
}
