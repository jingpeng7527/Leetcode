/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
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
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;
        
        ListNode next = head.next;
        ListNode temp = swapPairs(next.next);
        next.next = head;
        head.next = temp;

        return next;//after swapping, the order of next is now become the original head

        // useless???
        // if (head == null) {
        //     return null;
        // }
        // if (head.next == null) {
        //     return head;
        // }

        // //Add a tempo first node
        // ListNode tep = new ListNode(0);
        // tep.next = head;
        // ListNode pre = tep;
        // while (pre.next != null && pre.next.next != null) {
        //     ListNode temp = head.next.next;
        //     pre.next = head.next;
        //     head.next.next = head;
        //     head.next = temp;
        //     pre = head;
        //     head = pre.next;
        //     //!! after swapping, the head is still 1 but its postion is 2.
        // }
        // return tep.next;

        // // wrong answer!!!
        // int tep;
        // ListNode cur = head;
        // while (cur.next != null) {
        //     tep = cur.next.val;
        //     cur.next.val = cur.val;
        //     cur.val = tep;
        //     if (cur.next.next != null) {
        //         cur = cur.next.next;
        //     } else {
        //         break;
        //     }
        // }
        // return head;

    }
}
// @lc code=end
