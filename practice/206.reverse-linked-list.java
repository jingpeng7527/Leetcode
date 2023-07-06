import java.util.List;

/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return tmp;

        // ListNode prev = null;
        // ListNode tmp = null;
        // while (head != null) {
        //     tmp = head.next;
        //     head.next = prev;
        //     prev = head;
        //     head = tmp;
        // }
        
        // return prev;
        
        // ListNode dummy = new ListNode(-1, head);
        // ListNode pre = null;
        // ListNode cur = head;
        // ListNode next = null;

        // while (cur != null) {
        //     next = cur.next;
        //     cur.next = pre;
        //     pre = cur;
        //     cur = next;
        // }
        
        // return pre;

        // //recusion
        // if (head == null) {
        //     return null;
        // }
        // if (head.next == null) {
        //     return head;
        // }
        // ListNode re = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;
        // return re;
    }
}
// @lc code=end

