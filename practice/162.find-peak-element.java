/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        // 二分查找：
        // 1. 上坡： 峰值在右边
        // 2. 下坡： 峰值在左边
        // 3. 谷底： 在谷底时，返回左右都可以，因为题目要求返回任意一个峰值
        // tips：1. 考虑查找初始值，meaning跳过最左最右，防止越界
        //       2. 如果没有找到，根据大小，返回最左或最右

        int left = 1;
        int right = nums.length - 2;
        int mid = 0;

        while (left <= right) {
            mid = (right - left) / 2 + left;
            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            }

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        int lval = nums[0];
        int rval = nums[nums.length - 1];

            if (lval >= rval) {
                return 0;
            } else {
                return nums.length - 1;
            }


        // int idx = 0;
        // for (int i = 1; i < nums.length; ++i) {
        //     if (nums[i] > nums[idx]) {
        //         idx = i;
        //     }
        // }
        // return idx;
    }
}
// @lc code=end

