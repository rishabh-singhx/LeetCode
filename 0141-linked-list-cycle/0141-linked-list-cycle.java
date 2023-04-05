/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode x=head;
        int c=0;
        while(x!=null)
        {
            x=x.next;
            c++;
            if(c>10000)
            {
              return true;  
            } 
        }
        return false;
    }
}