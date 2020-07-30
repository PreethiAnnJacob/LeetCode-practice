/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode head = l3;
        int carry=0;
        while(l1!=null && l2!=null){
            int val = l1.val+l2.val+carry;
            if(val>9){
                l3.next = new ListNode(val-10);
                carry=1;
            }
            else{
                l3.next = new ListNode(val);
                carry=0;
            }
            l1=l1.next;
            l2=l2.next;
            l3=l3.next;
        }
        while(l1!=null){
            int val = l1.val+carry;
            if(val>9){
                l3.next = new ListNode(val-10);
                carry=1;
            }
            else{
                l3.next = new ListNode(val);
                carry=0;
            }
            l1=l1.next;
            l3=l3.next;
        }
        while(l2!=null){
            int val = l2.val+carry;
            if(val>9){
                l3.next = new ListNode(val-10);
                carry=1;
            }
            else{
                l3.next = new ListNode(val);
                carry=0;
            }
            l2=l2.next;
            l3=l3.next;
        }
        if (carry==1) l3.next = new ListNode(1);
        return head.next;
    }
}