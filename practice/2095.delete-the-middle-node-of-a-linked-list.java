/*
 * @lc app=leetcode id=2095 lang=java
 *
 * [2095] Delete the Middle Node of a Linked List
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode header = new ListNode(0, head);
        ListNode slow = header;
        ListNode fast = header.next;
        // ListNode pre = head;

        // if (head.next == null) {
        //     return null;
        // }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // System.out.println(pre.val+ " "+ slow.val+" "+ fast.val);
        }

        slow.next = slow.next.next;

        return header.next;
        



        // int count = 1;
        // ListNode cur = head;

        // if (head.next == null) {
        //     return null;
        // }
        
        // while (cur.next != null) {
        //     count++;
        //     cur = cur.next;
        // }
        
        // count = count / 2;
        // cur = head;

        // for (int i = 0; i < count-1; i++) {
        //     cur = cur.next;
        // }

        // cur.next = cur.next.next;

        // return head;

    }
}
// @lc code=end

