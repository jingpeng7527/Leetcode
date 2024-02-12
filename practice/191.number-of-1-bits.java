/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // 1. n & (n-1) 会将最后一个1变成0
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
        
        // int res = 0;
        // for (int i = 0; i < 32; i++) {
        //     if ((n & (1 << i))!= 0) {
        //         res++;
        //     }
        // }
        // return res;
    }
}
// @lc code=end

