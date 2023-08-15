/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        // backtracking
        List<Integer> tmp = new ArrayList<>();
        backTracking(0, tmp, nums);
        return res;
    }

    public void backTracking(int start, List<Integer> tmp, int[] nums ) 
    {
        res.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; i++) {
            tmp.add(nums[i]);
            backTracking(i+1, tmp, nums);
            tmp.remove(tmp.size() - 1);
        }
        
    //     List<List<Integer>> res = new ArrayList<>();
    //     List<Integer> str = new ArrayList<>();
    //     for (int i = 0; i <= nums.length; i++) {
    //         backTracking(nums, res, i, 0, str);
    //     }
    //     return res;
    // }

    // public void backTracking(int[] nums, List<List<Integer>> res, int length, int start, List<Integer> str) {
    //     if (str.size() == length) {
    //         List<Integer> tmp = new ArrayList<>(str);
    //         res.add(tmp);
    //         return;
    //     }

    //     for (int i = start; i < nums.length; i++) {
    //         str.add(nums[i]);
    //         backTracking(nums, res, length, i + 1, str);
    //         str.remove(str.size() - 1);
    //     }

        // //扩展法
        // List<List<Integer>> list = new ArrayList<>();
        // list.add(new ArrayList<>( ));

        // for (int i : nums) {
        // List<List<Integer>> tmp = new ArrayList<>(list);
        // // tmp.addAll(list);
        // for (List<Integer> list2 : list) {
        // List<Integer> tmp2 = new ArrayList<>(list2);
        // // tmp2.addAll(list2);
        // tmp2.add(i);
        // tmp.add(tmp2);
        // }
        // list = tmp;
        // }
        // return list;
    }
}
// @lc code=end
