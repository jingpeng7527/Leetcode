/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                res = Math.min(res, i - left + 1);
                sum -= nums[left++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;

        // if (nums.length == 0) {
        //     return 0;
        // }
        // int left = 0, right = 0;
        // int sum = 0;
        // int res = nums.length + 1;
        // while (right < nums.length) {
        //     sum += nums[right];
        //     while (sum >= target) {
        //         res = Math.min(right - left+1, res);
        //         sum -= nums[left];
        //         left++;
        //     }
        //     right++;
        // }

        // return res == nums.length + 1 ? 0 : res;
    }
}
// @lc code=end

