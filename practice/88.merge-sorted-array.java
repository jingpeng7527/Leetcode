/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int y = m + n - 1;

        // while (i >= 0 && j >= 0) {
        //     nums1[y] = Math.max(nums1[i], nums2[j]);
        //     if (nums1[i] > nums2[j]) {
        //         i--;
        //     } else {
        //         j--;
        //     }
        //     y--;
        // }

        // while (j >= 0) {
        //     nums1[y--] = nums2[j--];
        // }

        while (i >= 0 && j >= 0) {
        nums1[y--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        // if (nums1[i] > nums2[j]) {
        // nums1[y] = nums1[i];
        // i--;
        // } else {
        // nums1[y] = nums2[j];
        // j--;
        // }
        // y--;
        }
        System.arraycopy(nums2, 0, nums1, 0, j + 1);
    }
}
// @lc code=end
