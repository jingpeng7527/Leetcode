/*
 * @lc app=leetcode id=1991 lang=java
 *
 * [1991] Find the Middle Index in Array
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int total = Arrays.stream(nums).sum();
        int sum = 0;

        for (int i = 0; i < leftSum.length; i++) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        
        return -1;

    }
}
// @lc code=end

