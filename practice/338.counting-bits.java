/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // res[i] = Integer.bitCount(i);

            // clear the least significant bit
            // plus 1
            // res[i] = res[i & (i - 1)] + 1;

            // right shift 1 bit
            // plus one if the least significant bit is 1
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }
}
// @lc code=end

