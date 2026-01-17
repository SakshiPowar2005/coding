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
    public int[] nextLargerNodes(ListNode head) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(ListNode temp = head; temp != null; temp = temp.next) list.add(temp.val);

         int[] res = new int[list.size()];
         Stack<Integer> st = new Stack<>();
         
         for(int i = 0; i < list.size(); i++)
         {
            while(!st.isEmpty() && list.get(st.peek()) < list.get(i))
            {
                res[st.pop()] = list.get(i);
            }
            st.push(i);
         }

         return res;
    }
}
