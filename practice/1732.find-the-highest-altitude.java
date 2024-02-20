/*
 * @lc app=leetcode id=1732 lang=java
 *
 * [1732] Find the Highest Altitude
 */

// @lc code=start
class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int tmp = 0;

        for (int i = 0; i < gain.length; i++) {
            tmp = tmp + gain[i];
            max = Math.max(max, tmp);
        }
        return max;
    }
}
// @lc code=end

