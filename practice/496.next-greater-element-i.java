/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length];

        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int j = nums2.length - 1; j >= 0; j--) {
            while (!stack.isEmpty() && nums2[j] >= stack.peek()) {
                stack.pop();
            }
            map.put(nums2[j], stack.isEmpty() ? -1 : stack.peek());
            stack.push(nums2[j]);
        }
        
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
                
        // Stack<Integer> stack = new Stack<>();
        // Stack<Integer> tmp = new Stack<>();
        
        // for (int i : nums2) {
        //     stack.add(i);
        // }
        // for (int i = 0; i < nums1.length; i++) { 
        //     tmp.addAll(stack);
        //     int max = -1;
        //     while (!tmp.isEmpty()) {
        //         int cur = tmp.pop();
        //         if (cur > nums1[i]) {
        //             max = cur;
        //         } else if (cur == nums1[i]) {
        //             break;
        //         }
        //     }
        //     res[i] = max;
        // }
        return res;
    }
}
// @lc code=end

