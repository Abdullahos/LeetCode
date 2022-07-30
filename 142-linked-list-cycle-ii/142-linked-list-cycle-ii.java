/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Map map = new HashMap<ListNode,Integer>();
        int idx = 0;
        while(head!=null){
          if(!map.containsKey(head))
          {
                map.put(head,idx);
          }
            else {
                
        System.out.println("tail connects to node index "+map.get(head));
                return head;
            }
            head = head.next;
            idx++;
        }
        System.out.println("There is no cycle in the linked list.");        return head;
    }
}