/*
 * @lc app=leetcode id=1004 lang=java
 *
 * [1004] Max Consecutive Ones III
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        // int count = 0;
        int res = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                k--;
            }

            while (k < 0) {
                if (nums[left]==0) {
                    k++;
                }
                left++;
            }

            res = Math.max(right - left + 1, res);
            right++;
        }

        // while (right < nums.length) {
        //     // System.out.println("111"+left+ "  "+ right+"  "+ count);            
        //     if (count <= k) {
        //         // System.out.println("222"+left+ "  "+ right+"  "+ count);
        //         if (nums[right] != 1) {
        //             count++;
        //         }
        //         if (count <= k) {
        //             right++;
        //         }
                
        //         if (right == nums.length-1) {
        //             // System.out.println("333"+left+ "  "+ right+"  "+ count);

        //             res = Math.max(res, right - left - 1);
        //             return res;
        //         }
        //     } else {
        //         System.out.println(left+ "  "+ right+"  "+ count);

        //         res = Math.max(res, right - left-1);
        //         while (nums[left] != 0 && left < right) {
        //             left++;
        //         }
        //         left++;
        //         count--;
        //     }
        // }

        // while (right < nums.length) {
        //     if (nums[right] != 1) {
        //         count--;
        //     }

        //     while (count < 0) {
        //         if (nums[left] == 1) {
        //             left++;
        //         }
        //         if (nums[left] == 0) {
        //             count++;
        //             left++;
        //         }
        //     }
        //     // System.out.println(left+ "  "+ right+"  "+ count);

        //     res = Math.max(res, right - left+1);
        //     right++;
        // }
        return res;
    }
}
// @lc code=end