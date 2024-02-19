/*
 * @lc app=leetcode id=334 lang=java
 *
 * [334] Increasing Triplet Subsequence
 */

// @lc code=start
class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        // 1. brute force
        // for (int i = 0; i < nums.length - 2; i++) {
        //     for (int j = i + 1; j < nums.length - 1; j++) {
        //         for (int k = j + 1; k < nums.length; k++) {
        //             if (nums[i] < nums[j] && nums[j] < nums[k]) {
        //                 return true;
        //             }
        //         }
        //     }
        // }

        // 2. two pass
        // int[] left = new int[nums.length];
        // int[] right = new int[nums.length];
        // left[0] = nums[0];
        // right[nums.length - 1] = nums[nums.length - 1];
        // for (int i = 1; i < nums.length; i++) {
        //     left[i] = Math.min(left[i - 1], nums[i]);
        // }
        // for (int i = nums.length - 2; i >= 0; i--) {
        //     right[i] = Math.max(right[i + 1], nums[i]);
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     if (left[i] < nums[i] && nums[i] < right[i]) {
        //         return true;
        //     }
        // }

        // 3. one pass
        // int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] <= first) {
        //         first = nums[i];
        //     } else if (nums[i] <= second) {
        //         second = nums[i];
        //     } else {
        //         return true;
        //     }
        // }

        
        int first = nums[0];
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > second) {
                return true;
            } else if (nums[i] > first) {
                second = nums[i];
            } else {
                // in this case, the first could be in the back of second, 
                // but since second was updated, there must exist a number bigger than second, 
                // so we can just continue to search for the third one.
                
                // the reason why we update first in this way is because
                // we just want to find if this kind of situation exists, we don't have to find all the number combination to meet this requirement.
                // 
                // The purpose of updating first is to actually limit second, 
                // to ensure the second be relatively the second smallest number.
                // 更新first是为了后续更新second，因为second的更新依赖于first，second数值一定要比first大
                first = nums[i];
            }
        }
        return false;
    }
}
// @lc code=end

