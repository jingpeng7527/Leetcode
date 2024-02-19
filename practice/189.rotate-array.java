/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        // Solution 1: brute force
        // int n = nums.length;
        // k %= n;

        // for (int i = 0; i < k; i++) {
        //     int temp = nums[n - 1];
        //     for (int j = n - 1; j > 0; j--) {
        //         nums[j] = nums[j - 1];
        //     }
        //     nums[0] = temp;
        // }

        // Solution 2: using extra array
        // int n = nums.length;
        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        //     arr[(i + k) % n] = nums[i];
        // }

        // System.arraycopy(arr, 0, nums, 0, n);

        // Solution 3: using cyclic replacements
        // int n = nums.length;
        // k %= n;

        // int count = 0;
        // for (int start = 0; count < n; start++) {
        //     int current = start;
        //     int prev = nums[start];

        //     do {
        //         int next = (current + k) % n;
        //         int temp = nums[next];
        //         nums[next] = prev;
        //         prev = temp;
        //         current = next;
        //         count++;
        //     } while (start != current);
        // }

        // Solution 4: using reverse
        int n = nums.length;
        k %= n;

        reverse(nums, 0, n - 1);

        reverse(nums, 0, k - 1);

        reverse(nums, k, n - 1);

    }

    private void reverse(int[] nums, int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
// @lc code=end

