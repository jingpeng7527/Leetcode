/*
 * @lc app=leetcode id=1493 lang=java
 *
 * [1493] Longest Subarray of 1's After Deleting One Element
 */

// @lc code=start
class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int res = 0;
        int flag = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                flag++;
            }
            while (flag>1) {
                if (nums[left++]==0) {
                    flag--;
                }
            }
            res = Math.max(right - left, res);
            right++;
        }
        
        return res;
    }
}
// @lc code=end

