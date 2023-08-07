/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;

        while (left < right) {
            res = height[left] < height[right]
                    ? Math.max(res, (right - left) * height[left++])
                    : Math.max(res, (right - left) * height[right--]);
        }

        // while (left < right) {
        // int area = (right - left) * Math.min(height[left], height[right]);
        // if (height[left]<height[right]) {
        // left++;
        // } else {
        // right--;
        // }
        // res = Math.max(res, area);
        // }

        return res;
    }
}
// @lc code=end