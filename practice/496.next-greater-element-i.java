/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tmp = new Stack<>();
        
        int[] res = new int[nums1.length];

        for (int i : nums2) {
            stack.add(i);
            // tmp.add(i);
        }

        for (int i = 0; i < nums1.length; i++) { 
            tmp.addAll(stack);
            int max = -1;
            // System.out.println(tmp);
            while (!tmp.isEmpty()) {
                int cur = tmp.pop();
                if (cur > nums1[i]) {
                    max = cur;
                } else if (cur == nums1[i]) {
                    break;
                }
                // System.out.println(max);
            }
            res[i] = max;
            // tmp = stack;
        }

        return res;
    }
}
// @lc code=end

