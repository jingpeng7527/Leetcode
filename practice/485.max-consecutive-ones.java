/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums==null||nums.length==0) {
            return 0;
        }
        int res = 0;
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1) {
                flag++;
            } else {
                res = Math.max(res, flag);
                flag = 0;
            }
            
        }
        return Math.max(res, flag);
    }
}
// @lc code=end

