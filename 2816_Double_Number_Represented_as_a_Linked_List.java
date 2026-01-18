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
    public ListNode doubleIt(ListNode head) {
        //using stack 
        // Stack<Integer> st = new Stack<>();
        // int val = 0;

        // while(head != null)
        // {
        //     st.push(head.val);
        //     head = head.next;
        // }

        // ListNode temp = null;
        // while(!st.isEmpty() || val != 0)
        // {
        //     temp = new ListNode(0, temp);
        //     if(!st.isEmpty())
        //     {
        //         val += st.pop() * 2;
        //     }

        //     temp.val = val % 10;
        //     val = val / 10;
        // }

        // return temp;



        //optimal approach
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null)
        {
            int value = curr.val * 2;
            if(value < 10)
            {
                curr.val = value;
            }
            else if(prev != null)
            {
                curr.val = value % 10;
                prev.val = prev.val + 1;
            }
            else
            {
                head = new ListNode(1, curr);
                curr.val = value % 10;
            }

            prev = curr;
            curr = curr.next;
        }

        return head;
    }
}
