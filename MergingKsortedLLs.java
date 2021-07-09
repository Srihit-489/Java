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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists == null){
            return null;
        }
        PriorityQueue<ListNode> myqueue = new PriorityQueue<>(lists.length,(a,b)-> a.val- b.val);
        for(int i=0;i<lists.length;i++){
            if(lists[i] != null){
                 myqueue.add(lists[i]); 
            }
        }
        
        ListNode retnode = new ListNode(0);
        ListNode runner = retnode;
        while(myqueue.size() != 0){
            ListNode current = myqueue.remove();
            runner.next = current;
            runner = runner.next;
            if(current.next != null){
                myqueue.add(current.next);
            }
        }
        runner.next = null;
        return retnode.next;
        
    }
}
