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
    public ListNode reverseList(ListNode head) {
        ListNode next, prev, current;
        prev = null;
        current = head;
        
        // displayList(head);
        
        while (current != null){
            next = current.next;                        
            current.next = prev;            
            prev = current;
            current = next;            
        }
        
        head = prev;
        // displayList(head);
        
        return prev;
    }
    
    public void displayList(ListNode head){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
