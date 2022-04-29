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
    /*public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)    return head;
        ListNode n = null;
        ListNode p  = null;
        while(head != null){
            n = head.next;
            head.next = p;
            p = head;
            head = n;   
        }
        return p;
    }
    */
    public ListNode reverseList(ListNode head){
        if(head==null || head.next == null) return head;
        ListNode current = head;
        ListNode prev = null;
        while(current!=null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
//time complexity O(N)
//space complexity O(1)