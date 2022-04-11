/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int count = nums[0]
        int count = 0;;

        int start = 0;

        // int end = 0;

        int res = nums.length + 1;

        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            while (count >= target) {
                res = Math.min(res, i - start + 1);
                count -= nums[start++];
                // start++;
            }
        }

        // while (start <= nums.length - 1) {
        //     if (count < target) {
        //         if (end < nums.length - 1) {
        //             end++;
        //             count += nums[end];
        //         } else {
        //             break;
        //         }
        //     } else {
        //         if (res > end - start + 1) {
        //             res = end - start + 1;
        //         }

        //         start++;
        //         if (start < nums.length ) {
        //             count = nums[start];
        //             end = start;
        //         }

        //     }
        // }

        if (res == nums.length + 1) {
            return 0;
        }

        return res;
    }
}
// @lc code=end