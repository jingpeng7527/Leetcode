/*
 * @lc app=leetcode id=1911 lang=java
 *
 * [1911] Maximum Alternating Subsequence Sum
 */

// @lc code=start
class Solution {
    public long maxAlternatingSum(int[] nums) {
        long even = 0, odd = 0;
        
        for (int i = 0; i < nums.length; i++) {
            even = Math.max(odd+nums[i], even);
            odd = Math.max(even-nums[i], odd);
        }
        return even;
    }
}
// @lc code=end

