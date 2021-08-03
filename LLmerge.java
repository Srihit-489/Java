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
        ListNode sentinal = new ListNode(0);
        ListNode runner = sentinal;
        while(  l1 != null && l2 != null){
            if(l1.val < l2.val){
                runner.next = l1;
                l1 = l1.next;
                runner = runner.next;
            }else{
                runner.next = l2;
                l2 = l2.next;
                runner = runner.next;
            }
                
        }
        
        while(l1 != null){
            runner.next = l1;
            l1 = l1.next;
            runner = runner.next;
        }
        
        while(l2 != null){
            runner.next = l2;
            runner = runner.next;
            l2 = l2.next;
        }
        
        return sentinal.next;
    }
}
