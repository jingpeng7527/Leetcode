/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        if (nums.length==1&&nums[0]==target) {
            return 0;
        }

        while (left <= right) {
            int mid = left  + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;

        // if (nums.length==1&&nums[0]==target) {
        //     return 0;
        // }

        // while (left <= right) {
        //     int mid = left +(right-left)/2;
        //     // System.out.println(mid);
        //     if (nums[mid] == target) {
        //         return mid;
        //     } else if (nums[mid] > target) {
        //         right = mid - 1;
        //     } else {
        //         left = mid + 1;
        //     }
        // }
        
        // return -1;

    }
}
// @lc code=end

