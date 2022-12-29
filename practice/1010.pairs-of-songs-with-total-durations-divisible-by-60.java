/*
 * @lc app=leetcode id=1010 lang=java
 *
 * [1010] Pairs of Songs With Total Durations Divisible by 60
 */

// @lc code=start
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] count = new int[60];
        int cp = 0;
        for (int i : time) {
            int remainer = i % 60;
            cp += count[remainer];

            int target = remainer == 0 ? 0 : 60 - remainer;
            count[target]++;
        }
        return cp;
    }
}
// @lc code=end

