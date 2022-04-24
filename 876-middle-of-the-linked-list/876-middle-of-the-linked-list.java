/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
3 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode _1 = head;
        ListNode _2 = head;
        while(_2.next != null && _2.next.next!=null){
            _1 = _1.next;
            _2 = _2.next.next;
        }
        return _2.next!=null ? _1.next : _1;
    }
}