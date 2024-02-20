/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        int end = start+k;
        double res = 0;
        double cur = 0;
        for (int i = 0; i < k; i++) {
            cur += nums[i];
            res = cur;
        }
       
        while (end < nums.length) {
            cur = cur-nums[start++]+nums[end++];
            res = Math.max(res, cur);
            // System.out.println(cur+ " "+ res+" "+ start+" "+end);
        }

        return res / k;
    }
}
// @lc code=end
