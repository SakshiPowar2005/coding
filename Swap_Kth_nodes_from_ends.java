/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) {
     
      if(head == null)
      {
          return head;
      }
      
      Node curr = head;
      int n = 0;
      
      while(curr != null)
      {
          n++;
          curr = curr.next;
      }
      
      // If k is greater than length, no swap
      if(k > n)
      {
          return head;
      }
      
      //if kth from start and end are same
      if(2 * k - 1 == n)
      {
          return head;
      }
      
      Node first = head;
      for(int i = 1; i < k; i++)
      {
          first = first.next;
      }
      
      Node second = head;
      for(int i = 1; i < n - k + 1; i++)
      {
          second = second.next;
      }
      
      int temp = 0;
      temp = first.data;
      first.data = second.data;
      second.data = temp;
      
      return head;
    }
}
