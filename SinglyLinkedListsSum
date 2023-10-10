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
        ListNode result = new ListNode();
        ListNode node = result;
        // printDigits(l1);
        // printDigits(l2);
        // int sum = getValue(l1) + getValue(l2);
        int carry = 0;
        for (int i = 0; i < 100; i++ ){
            int sum = l1.val + l2.val + carry;

            if(sum > 9){
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }

            System.out.println("Sum " + sum);
            
            node.next = new ListNode(sum);
            node = node.next;

            if(l1.next == null && l2.next == null && carry == 0){
                break;
            }                        

            if(l1.next !=null){
                l1 = l1.next;
            } else {
                l1.val =  0;
            }

            if(l2.next !=null){
                l2 = l2.next;
            } else {
                l2.val =  0;
            }
        }

        return result.next;
        
    }

    public int getDigit(ListNode l){
        int digit = 0;
        if(l.next != null){
            digit = l.val;
            l = l.next;
        }
        return digit;
    }
    public void printDigits(ListNode l){
        for (int i = 0; i < 100; i++){
            System.out.printf("Digit in position %d is %d \n", i, l.val);

            if(l.next == null){
                break;
            }

            l = l.next;

        }
    }

    public int getValue(ListNode l){
        int result = 0;
        for (int i = 0; i < 100; i++){
            result += l.val * Math.pow(10, i);

            if(l.next == null){
                break;
            }

            l = l.next;
            
        }
        return result;
    }    
}
