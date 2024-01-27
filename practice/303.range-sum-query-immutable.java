/*
 * @lc app=leetcode id=303 lang=java
 *
 * [303] Range Sum Query - Immutable
 */

// @lc code=start
class NumArray {
    // int[] nums;
    // public NumArray(int[] nums) {
    //     this.nums = nums;
    // }

    // public int sumRange(int left, int right) {
    //     int res = 0;
    //     for (int i = left; i <= right; i++) {
    //         res += this.nums[i];
    //     }
    //     return res;
    // }

    int[] sums;

    public NumArray(int[] nums) {
        sums = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            sums[i+1] = sums[i] + nums[i];
        }
        
    }

    public int sumRange(int left, int right) {
        return sums[right+1] - sums[left]; // unclear}
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
// @lc code=end

