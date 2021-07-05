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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode kthNodeHead = head;
        ListNode kthNodeTail = head;
        ListNode temprunner;
        int count = k-1;
        while(count != 0 && kthNodeHead != null){
            count--;
            kthNodeHead = kthNodeHead.next;
        }
        temprunner = kthNodeHead;
        while(temprunner.next != null){
            temprunner = temprunner.next;
            kthNodeTail = kthNodeTail.next;
        }
        
        int temp = kthNodeHead.val;
        kthNodeHead.val = kthNodeTail.val;
        kthNodeTail.val = temp;
        return head;
        
    }
}
