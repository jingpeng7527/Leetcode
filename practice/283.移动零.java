package practice;

/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {

        int slow = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                slow = i;
                break;
            }
        }

        int fast = slow + 1;

        if (slow >= 0) {
            while (fast < nums.length) {
                if (nums[fast] != 0) {
                    nums[slow] = nums[fast];
                    nums[fast] = 0;
                    slow++;
                }
                fast++;
            }
        }

    }
}
// @lc code=end
