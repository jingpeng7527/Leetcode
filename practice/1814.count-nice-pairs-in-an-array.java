/*
 * @lc app=leetcode id=1814 lang=java
 *
 * [1814] Count Nice Pairs in an Array
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int countNicePairs(int[] nums) {
        long res = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] - rev(nums[i]);
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        final int MOD = (int) 1e9 + 7;

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer value : hm.values()) {
            res = (res + (long)value * (value - 1) / 2) % MOD;
        }
        
        return (int)res;
   }


    public int rev(int n) {
        int res = 0;
        while (n > 0) {
            res = res * 10 + n % 10;
            n /= 10;
        }
        return res;
    }
}
// @lc code=end

