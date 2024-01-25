/*
 * @lc app=leetcode id=1503 lang=java
 *
 * [1503] Last Moment Before All Ants Fall Out of a Plank
 */

// @lc code=start
class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        // int[] antsPos = new int[n];
        int res = 0;

        for (int i = 0; i < left.length; i++) {
            res = Math.max(res, left[i]);
        }
        for (int i = 0; i < right.length; i++) {
            res = Math.max(res, n - right[i]);
        }

        return res;
    }
}
// @lc code=end

