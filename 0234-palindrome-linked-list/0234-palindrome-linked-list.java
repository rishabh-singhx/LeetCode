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
    static ListNode left;
    public boolean isPalindrome(ListNode head) {
        left=head;
        return check(head);
    }
    public boolean check(ListNode right){
        if(right==null)
            return true;
        boolean result = check(right.next);
        if(result == false)
            return false;
        boolean isEqual = left.val==right.val;
        left=left.next;
        return isEqual;
    }
}