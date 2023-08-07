/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        // use left and right product lists, but use constant space, and use one array,
        // and use one loop
        int[] tmp = new int[nums.length];
        Arrays.fill(tmp, 1);

        int l = 1, r = 1;
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] *= l;
            tmp[nums.length - i - 1] *= r;

            l *= nums[i];
            r *= nums[nums.length - i - 1];
        }

        // use left and right product lists, but use constant space, and use one array

        // int r = 1;
        // for (int i = 1; i < tmp.length; i++) {
        // tmp[i] = tmp[i - 1] * nums[i-1];
        // }

        // for (int i = nums.length - 2; i >= 0; i--) {
        // r *= nums[i + 1];
        // tmp[i] = tmp[i] * r;
        // }

        return tmp;

        // wrong solution: use division
        // int tmp = 1;
        // int[] res = new int[nums.length];
        // Arrays.fill(res, 0);
        // int flag = -1, count = 0;
        // for (int i = 0; i < res.length; i++) {
        // if (nums[i] != 0) {
        // tmp *= nums[i];
        // } else {
        // flag = i;
        // count++;
        // }
        // }

        // if (count <= 1) {
        // if (flag >= 0) {
        // res[flag] = tmp;
        // } else {
        // for (int i = 0; i < res.length; i++) {
        // res[i] = tmp / nums[i];
        // }
        // }
        // }

        // return res;
    }
}
// @lc code=end
