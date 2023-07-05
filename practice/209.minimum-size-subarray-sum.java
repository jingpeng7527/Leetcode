/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0, right = 0;
        int sum = 0;
        int res = nums.length + 1;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                res = Math.min(right - left+1, res);
                sum -= nums[left];
                left++;
            }
            right++;
        }

        return res == nums.length + 1 ? 0 : res;
    }
}
// @lc code=end

