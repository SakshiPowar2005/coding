/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode temp = head;
        ListNode dummynode1 = new ListNode(-1);
        ListNode dummynode2 = new ListNode(-1);
        ListNode curr = dummynode1;
        ListNode curr1 = dummynode2;
        dummynode1.next = head;

        while(temp != null)
        {
            if(temp.val < x)
            {
                curr.next = temp;
                curr = curr.next;
            }
            else if(temp.val >= x)
            {
                curr1.next = temp;
                curr1 = curr1.next;
            }
            temp = temp.next;

        }
        curr1.next = null;
        curr.next = dummynode2.next;

        return dummynode1.next;
    }
}
