/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;

        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] >= nums[0] && target < nums[0]) {
                left = mid + 1;
            } else if (nums[mid] < nums[0] && target >= nums[0]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        
        return -1;

    }
}
// @lc code=end

