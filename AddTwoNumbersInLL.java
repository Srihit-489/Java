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
        int carry = 0;
        ListNode runner1 = l1;
        ListNode runner2 = l2;
        ListNode result = new ListNode(0);
        ListNode returnreference = result;
        while(!(runner1 == null && runner2 == null)){
            int num1;
            int num2;
            if(runner1 != null){
                num1 = runner1.val;
                runner1 = runner1.next;
            }else{
                num1 = 0;
            }
            if(runner2 != null){
                num2 = runner2.val;
                runner2 = runner2.next;
            }else{
                num2 = 0;
            }
            int sum = (num1+num2+carry)%10;
            carry = (num1+num2+carry)/10;
            result.next = new ListNode(sum);
            result = result.next;
        }
        if(carry != 0){
            result.next = new ListNode(carry);
        }
        return returnreference.next;
    }
}
