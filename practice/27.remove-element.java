/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;

        // int slow = 0;
        // for (int fast = 0; fast < nums.length; fast++) {
        // if (nums[fast] != val) {
        // nums[slow] = nums[fast];
        // slow++;
        // }
        // }
        // return slow;

        // int left = 0;
        // int right = nums.length - 1;
        // while (right >= 0 && nums[right] == val) {
        //     right--;
        // }
        // while (left <= right) {

        //     if (nums[left] == val) {
        //         nums[left] = nums[right];
        //         right--;
        //     }
        //     left++;
        //     while(right >= 0 && nums[right] == val) right--;
        // }

        // return left;
    }
}
// @lc code=end
