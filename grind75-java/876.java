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
    public ListNode middleNode(ListNode head) {
        int size=nodeSize(head);
        int counter=0;
        while(head!=null){
            if(counter==size/2) return head;
            head=head.next;
            counter++;
            
        }
        return head;
    }
    public int nodeSize(ListNode head){
        if(head==null)return 0;
        return nodeSize(head.next)+1;
    }
}