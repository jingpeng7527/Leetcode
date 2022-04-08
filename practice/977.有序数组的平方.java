/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int k = nums.length - 1;

        int pos = nums.length - 1;

        int[] result = new int[nums.length];

        while (i <= k) {
            if (nums[i] * nums[i] < nums[k] * nums[k]) {
                result[pos] = nums[k] * nums[k];
                k--;
            } else {
                result[pos] = nums[i] * nums[i];
                i++;
            }
            pos--;
        }

        return result;
    }
}
// @lc code=end
