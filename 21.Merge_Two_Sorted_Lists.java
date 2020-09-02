/*
Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)    return null;
        if(l1==null)    return l2;
        if(l2==null)    return l1;
        ListNode l3;ListNode out;
        if(l1.val<=l2.val){
            l3=new ListNode(l1.val);
            l1=l1.next;
        }
        else{    
            l3=new ListNode(l2.val);
            l2=l2.next;
        }
        out=l3;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                l3.next=l1;
                l1=l1.next;
            }
            else{    
                l3.next=l2;
                l2=l2.next;
            }
            l3=l3.next;
        }
        if(l1!=null)
            l3.next=l1;
        if(l2!=null)
            l3.next=l2;
        return out;
    }
}
