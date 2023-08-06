/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    private int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }
    
    public int majorityElement(int[] nums) {
        // divide and conquer
        return getMajority(nums, 0, nums.length - 1);


        // // sorting
        // Arrays.sort(nums);
        // return nums[nums.length / 2];

        // // Boyer-Moore voting
        // 摩尔投票法
        // 1. 选出一个候选人
        // 2. 遍历数组，如果当前元素与候选人相同，count++，否则count--
        // 3. 如果count为0，更换候选人
        // 4. 最后留下的候选人就是众数
        
        // int candi = 0;
        // int count =0;

        // for (int i : nums) {
        //     if (count == 0) {
        //         candi =i;
        //     }
        //     count += candi == i ? 1 : -1;
        // }
        // return candi;
    }

    public int getMajority(int[] nums, int le, int ri) {
        if (le == ri) {
            return nums[le];
        }

        int mid = le + (ri - le) / 2;
        int leftMar = getMajority(nums, le, mid);
        int rightMar = getMajority(nums, mid + 1, ri);
        
        if (leftMar == rightMar) {
            return leftMar;
        }
        
        int leftCount = countInRange(nums, leftMar, le, ri);
        int rightCount = countInRange(nums, rightMar, le, ri);

        return leftCount > rightCount ? leftMar : rightMar;
    }
}
// @lc code=end

