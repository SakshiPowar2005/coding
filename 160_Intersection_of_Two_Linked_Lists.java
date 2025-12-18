/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 
// public class Solution {

//     public int getListlength(ListNode head)
//     {
//         int count = 0;
//         ListNode temp = head;

//         while(temp != null)
//         {
//             count++;
//             temp = temp.next;
//         }

//         return count;
//     }

//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
//         int lenA = getListlength(headA);
//         int lenB = getListlength(headB);


//         while(lenA > lenB)
//         {
//             headA = headA.next;
//             lenA--;
//         }
//         while(lenB > lenA)
//         {
//             headB = headB.next;
//             lenB--;
//         }

//         while(headA != null && headB != null)
//         {
//             if(headA == headB) return headA;
//             headA = headA.next;
//             headB = headB.next;
//         }

//         return null;
//     }
// }



//better approach
public class Solution
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != temp2)
        {
            temp1 = (temp1 == null) ? headB : temp1.next;
            temp2 = (temp2 == null) ? headA : temp2.next;
        }

        return temp1;
    }

}
