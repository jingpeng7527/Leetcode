/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;

        // int[] dp = new int[n + 1];
        // if (n <= 2)
        //     return n;
        // dp[1] = 1;
        // dp[2] = 2;
        // for (int i = 3; i < n + 1; i++) {
        //     dp[i] = dp[i - 1] + dp[i - 2];
        // }
        
        // return dp[n];
    }
}
// @lc code=end

