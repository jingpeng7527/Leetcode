import javax.print.event.PrintEvent;

/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// @lc code=start
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1,head);
        ListNode prev = dummy;
        head = dummy;

        for (int i = 0; i < n; i++) {
            head = head.next;
        }

        while (head.next != null) {
            prev = prev.next;
            head = head.next;
        }

        prev.next = prev.next.next;

        return dummy.next;


        // ListNode tep = new ListNode(-1);
        // tep.next = head;
        // ListNode slow = tep;
        // ListNode fast = tep;
        
        // for (int i = 0; i < n; i++) {
        //     fast = fast.next;
        // }

        // while (fast.next != null) {
        //     fast = fast.next;
        //     slow = slow.next;
        // }
        
        // slow.next = slow.next.next;
        // return tep.next;
    }
}
// @lc code=end

