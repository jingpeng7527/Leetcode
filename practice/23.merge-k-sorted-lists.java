/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

// @lc code=start

import java.util.PriorityQueue;

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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0) {
            return null;
        }
        ListNode dummy = new ListNode(-1), p = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> (a.val - b.val));

        // add the head to the heap
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        while (!pq.isEmpty()) {
            ListNode head = pq.poll();
            p.next = head;

            if (head.next != null) {
                pq.add(head.next);
            }
            p = p.next;
        }
        return dummy.next;
    }
}
// @lc code=end
