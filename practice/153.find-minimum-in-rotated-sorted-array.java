/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        // int res = 0;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[right] > nums[middle] ) {
                right = middle;
            } else if(nums[right] < nums[middle]){
                left = middle+1;
            }
        }
        return nums[left];
    }
}
// @lc code=end
