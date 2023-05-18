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
        Set<Integer> mapp = new HashSet<>();
        Boolean flag = false;

        // for (int i : nums) {
        //     mapp.add(i);
        // }
        // return mapp.size()!=nums.length;

        for (int i : nums) {
            if (!mapp.add(i)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
// @lc code=end

