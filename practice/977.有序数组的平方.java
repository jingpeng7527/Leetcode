/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        int k = nums.length - 1;

        int[] result = new int[nums.length];

        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[k] = nums[i] * nums[i];
                i++;
            } else {
                result[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }

        return result;

        // int i = 0;
        // int k = nums.length - 1;

        // int pos = nums.length - 1;

        // int[] result = new int[nums.length];

        // while (i <= k) {
        // if (nums[i] * nums[i] < nums[k] * nums[k]) {
        // result[pos] = nums[k] * nums[k];
        // k--;
        // } else {
        // result[pos] = nums[i] * nums[i];
        // i++;
        // }
        // pos--;
        // }

        // return result;
    }
}
// @lc code=end
