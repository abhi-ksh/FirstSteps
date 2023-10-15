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
    public boolean isPalindrome(ListNode head) {
        ListNode headCopy = head;
        
        // printList(head);
        
        Stack<Integer> st = new Stack<>();
        while(head != null){
            st.push(head.val);
            head = head.next;
        }
        
        while(headCopy != null){
            if(headCopy.val != st.pop()){
                return false;
            }            
            headCopy = headCopy.next;
        }
        
        return true;
    }
    
    public void printList(ListNode head){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }        
    }
}
