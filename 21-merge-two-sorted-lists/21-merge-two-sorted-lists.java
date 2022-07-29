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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2!=null)    return l2;
        if(l2==null && l1!=null)    return l1;
        if(l1 == null && l2 == null)    return null;
        
        ListNode p = l1.val<=l2.val? l1 : l2;
        ListNode c = l1.val<=l2.val? l1 : l2;
        ListNode n = l1.val<=l2.val? l2 : l1;
        while(n!=null){
            while(c!=null && n.val>=c.val){
                p = c;
                c = c.next;
            }
            p.next = n;
            ListNode temp = n.next;
            n.next = c;
            p = n;
            n = temp;
        }
        return l1.val<=l2.val? l1: l2;
    }
    */
    /*
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1 == null)  return l2;
            if(l2 == null)  return l1;
            ListNode head;
            ListNode current;
            if(l1.val < l2. val){
                current = l1;
                l1 = l1.next;
            }
            else{
                current = l2;
                l2 = l2.next;
            }
            head = current;
            while(l1 != null && l2 != null){
                if(l1.val < l2. val){
                    current.next = l1;
                    l1 = l1.next;
                }
                else{
                    current.next = l2;
                    l2 = l2.next;
                }    
                current = current.next;
            }
            if(l1 == null && l2 == null)    return head;
            if(l1 == null) current.next = l2;
            else    current.next = l1;
            return head;
        }
    */
      public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1 == null) return l2;
            if(l2 ==null ) return l1;
            ListNode head;
            if(l1.val < l2.val){
                head = l1;
                l1 = l1.next;
            }
            else{
                head = l2;
                l2 = l2.next;
                
            }
            ListNode cur = head;
            while(l1!=null && l2!=null){
                if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
                }
                else{
                    cur.next = l2;
                    l2 = l2.next;

                }
                cur = cur.next;
            }
            if(l1 !=null){
                cur.next = l1;
            }
            else{
                cur.next = l2;
            }
          return head;
      }
     
    
}
//time complexity O(N)
//space compelxity O(1)