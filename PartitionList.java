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
    public ListNode partition(ListNode head, int x) {
        ListNode leftside = new ListNode(0);
        ListNode leftrunner = leftside;
        ListNode rightside = new ListNode(0);
        ListNode rightrunner = rightside;
        ListNode runner = head;
        while(runner != null){
            if(runner.val < x) {
                leftrunner.next = runner;
                leftrunner = leftrunner.next;
                runner = runner.next;
            }else{
                rightrunner.next = runner;
                rightrunner = rightrunner.next;
                runner = runner.next;
            }
        }
        rightrunner.next = null;
        leftrunner.next = rightside.next;
        return leftside.next;
    }
}
