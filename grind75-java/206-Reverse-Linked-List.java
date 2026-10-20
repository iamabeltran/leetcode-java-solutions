import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
        if(head==null) return head;
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head= head.next;
        }
        Collections.reverse(list);
        System.out.println("Arraylist :"+list.toString());
        ListNode result = new ListNode(list.get(0));
        ListNode current= result;
        int count=0;
        for(Integer element: list){
            if(count==0) {
            }else{
                current.next= new ListNode(element);
                current=current.next;
            }
            count++;
            
        }
        return result;
    }
}