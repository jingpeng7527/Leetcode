/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;

        for (int i = 0; i < nums.length; i++) {
            int tmp = rob2;
            rob2 = Math.max(rob1 + nums[i], rob2);
            rob1 = tmp;
        }
        
        return rob2;
    }
}
// @lc code=end

