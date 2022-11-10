/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;

            cur.next = new ListNode(sum);

            cur = cur.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }

        if (carry == 1) {
            cur.next = new ListNode(carry);
        }

        return pre.next;

        // ListNode dummy = new ListNode(-1);
        // ListNode res = new ListNode(0);
        // dummy.next = res;
        // int flag = 0;
        // ListNode l1head = new ListNode(-1, l1);
        // ListNode l2head = new ListNode(-1, l2);

        // while (l1head.next != null || l2head.next != null) {
        // if (l1head.next != null) {
        // l1head = l1head.next;
        // } else {
        // l1head.val = 0;
        // }

        // if (l2head.next != null) {
        // l2head = l2head.next;
        // } else {
        // l2head.val = 0;
        // }
        // if (flag == 1) {
        // res.val = (l1head.val + l2head.val + 1) % 10;
        // if ((l1head.val + l2head.val + 1) / 10 < 1) {
        // flag = 0;
        // }
        // System.out.println(res.val);

        // } else {
        // res.val = (l1head.val + l2head.val) % 10;
        // System.out.println(res.val);
        // }

        // if ((l1head.val + l2head.val) / 10 >= 1) {
        // flag = 1;
        // }
        // if (l1head.next != null || l2head.next != null||flag==1) {
        // res.next = new ListNode(1);
        // res = res.next;
        // }
        // }
        // return dummy.next;
    }
}
// @lc code=end