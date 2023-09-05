/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

       
        
        while (true) {
            if (fast == null || fast.next == null)
                return null;
            
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }
        
        slow = head;

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        
        return fast;

        // while (fast != null && fast.next != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;

        //     if (slow == fast) {
        //         ListNode index1 = fast;
        //         ListNode index2 = head;

        //         while (index1 != index2) {
        //             index1 = index1.next;
        //             index2 = index2.next;

        //         }

        //         return index1;
        //     }
        // }

        // return null;
    }
}
// @lc code=end
