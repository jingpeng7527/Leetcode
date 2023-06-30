/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], 1);
        }
        
        return false;

        // Set<Integer> mapp = new HashSet<>();
        // Boolean flag = false;

        // // for (int i : nums) {
        // //     mapp.add(i);
        // // }
        // // return mapp.size()!=nums.length;

        // for (int i : nums) {
        //     if (!mapp.add(i)) {
        //         flag = true;
        //         break;
        //     }
        // }
        // return flag;
    }
}
// @lc code=end

