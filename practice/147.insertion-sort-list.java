/*
 * @lc app=leetcode id=147 lang=java
 *
 * [147] Insertion Sort List
 */

// @lc code=start

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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = prev.next;
        while (cur.next != null) {

            while (cur.next != null && cur.val <= cur.next.val) {
                cur = cur.next;
            }
            if (cur.next == null) {
                break;
            }
            while (prev.next != null && prev.next.val <= cur.next.val) {
                prev = prev.next;
            }

            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
            prev = dummy;
        }
        return dummy.next;
    }
}

// 
// @lc code=end

