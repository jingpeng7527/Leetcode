/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return left;

        // // int res = -1;

        // // if (target < nums[0]) {
        // //     return 0;
        // // }

        // while (left <= right) {
        //     mid = left + (right - left) / 2; 
        //                // System.out.println(mid);
        //     if (nums[mid] == target) {
        //         return mid;
        //     } else if (nums[mid] > target) {
        //         right = mid - 1;
        //     } else {
        //         left = mid + 1;
        //     }
        // }
        
        // return left;

    }
}
// @lc code=end

