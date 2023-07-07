/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        return getMax(nums, 0, nums.length - 1);
    }

    public int getMax(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int mid = left + (right - left) / 2;
        int leftMax = getMax(nums, left, mid);
        int rightMax = getMax(nums, mid + 1, right);
        int crossMax = getCrossMax(nums, left, right);

        return Math.max(Math.max(rightMax, leftMax), crossMax);
    }
    
    public int getCrossMax(int[] nums, int left, int right) {
        int mid = left + (right - left) / 2;
        int leftSum = nums[mid];
        int leftRes = leftSum;
        
        for (int i = mid - 1; i >= left; i--) {
            leftSum += nums[i];
            leftRes = Math.max(leftRes, leftSum);
        }

        int rightSum = nums[mid + 1];
        int rightRes = rightSum;
        for (int i = mid + 2; i <= right; i++) {
            rightSum += nums[i];
            rightRes = Math.max(rightRes, rightSum );
        }
        return leftRes+rightRes;
    }
}
// @lc code=end

