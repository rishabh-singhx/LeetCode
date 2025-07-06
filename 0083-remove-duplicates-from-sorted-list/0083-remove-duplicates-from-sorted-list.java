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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode head1 = head;
        while(head!=null&&head.next!=null){
            if(head.val==head.next.val){
                ListNode temp = head.next;
                head.next=head.next.next;
                temp.next=null;
            }
            else
                head=head.next;
        }
        return head1;
    }
}