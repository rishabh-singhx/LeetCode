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
    public int getDecimalValue(ListNode head) {
        int ans=0;
        ListNode curr=head;
        int size=-1;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        curr=head;
        while(curr!=null){
            ans += curr.val * Math.pow(2,size);
            size--;
            curr=curr.next;
        }
        return ans;
    }
}