/*
 * @lc app=leetcode id=143 lang=java
 *
 * [143] Reorder List
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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode hh = head;
        ListNode tmp = null;
        ListNode tmp2 = null;

        // find the mid
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = slow.next;
        // System.out.println(slow.val);

        // reorder the second
        ListNode prev = null;
        while (slow != null) {
            tmp = slow.next;
            // System.out.println(tmp.val);
            slow.next = prev;
            prev = slow;
            slow = tmp;
            // System.out.println(slow.val);
        }

        while (hh != null && prev != null) {
            tmp = hh.next;
            tmp2 = prev.next;
            prev.next = tmp;
            hh.next = prev;
            prev = tmp2;
            hh = tmp;
        }
        hh.next = null;
    }
}
// @lc code=end

