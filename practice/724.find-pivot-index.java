/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int pivotIndex(int[] nums) {
        // two array to store front and back sum, a better way is 
        // 记数组的全部元素之和为 total，当遍历到第 i 个元素时，设其左侧元素之和为 sum，则其右侧元素之和为 total−numsi−sum
        // 左右侧元素相等即为 sum=total−numsi−sum, 即 2×sum+numsi=total
        
        int[] leftSum = new int[nums.length];
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        
        for (int i = 0; i < leftSum.length; i++) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        
        return -1;



    //     int[] leftSum = new int[nums.length];
    //     int[] rightSum = new int[nums.length];
    //     int leftCur = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         leftSum[i] = leftCur;
    //         leftCur += nums[i];
    //     }

    //     for (int i = 0; i < rightSum.length; i++) {
    //         rightSum[i] = leftCur - leftSum[i] - nums[i];
    //     }
        
    //     for (int i = 0; i < rightSum.length; i++) {
    //         if (leftSum[i] == rightSum[i]) {
    //             return i;
    //         }
    //     }
    //     return -1;
    }
}
// @lc code=end

