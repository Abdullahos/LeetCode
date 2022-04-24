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
    /*
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //if size is 1
        if(head.next==null) return null;
        
        ListNode fast = head;
        ListNode slow = head;
        
        if(n == 1){
            while(fast.next.next != null){
                fast = fast.next;
            }
            fast.next = fast.next.next;
            return head;
        }
        
        for(int i = 1; i<n; i++){
            fast = fast.next;
        }
        while(fast.next!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        //reach the end
        slow.val = slow.next.val;
        slow.next = slow.next.next;
        
        return head;
    }
    */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)   return null;
        ListNode fast = head;
        ListNode slow = head;
        //make fast ahead of slow by n nodes
        for(int i = 0 ; i < n; i++){
            fast = fast.next;
        }
        //if n was == size
        if(fast==null)  return slow.next;
        //when fast is at tail, slow is before the target 
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}