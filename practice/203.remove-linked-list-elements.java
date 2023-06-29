/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // ListNode cur = head;
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy;
        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
            } else {
                prev = head;
            }
            head = head.next;
        }
        return dummy.next;


        // ListNode dummy = new ListNode(-1, head);
        // ListNode pre = dummy;
        // ListNode cur = head;
        // while (cur != null) {
        //     if (cur.val == val) {
        //         pre.next = cur.next;
        //     }else{
        //         pre = cur;
        //     }
        //     cur = cur.next;
        // }
        // return dummy.next;
    }
}
// @lc code=end
