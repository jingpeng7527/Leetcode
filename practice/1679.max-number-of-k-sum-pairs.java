/*
 * @lc app=leetcode id=1679 lang=java
 *
 * [1679] Max Number of K-Sum Pairs
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 0;
        int i = 0, j = nums.length - 1;
        while (i<j) {
            int m = nums[i] + nums[j];
            if (m ==k) {
                res++;
                i++;
                j--;
            }else if (m<k) {
                i++;
            } else {
                j--;
            }
        }

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i : nums) {
        //     if (map.containsKey(i) && map.get(i) != 0) {
        //         res++;
        //         map.put(i, map.get(i) - 1);
        //     } else {
        //         map.put(k - i, map.getOrDefault(k - i, 0) + 1);
        //     }
        // }
        return res;
    }
}
// @lc code=end

