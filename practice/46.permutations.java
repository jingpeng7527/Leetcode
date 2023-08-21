/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> list = new ArrayList<>();
   
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        additem(nums, tmp, used);
        return list;
    }

    public void additem(int[] nums, List<Integer> tmp, boolean[] used) {
        
        if (tmp.size() == nums.length) {
            list.add(new ArrayList<>(tmp));
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            tmp.add(nums[i]);
            used[i] = true;
            additem(nums, tmp, used);
            tmp.remove(tmp.size() - 1);
            used[i] = false;
        }
    }
}
// @lc code=end

