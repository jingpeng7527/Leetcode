/*
 * @lc app=leetcode id=2215 lang=java
 *
 * [2215] Find the Difference of Two Arrays
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        for (int i : nums1) {
            set1.add(i);
        }

        for (int i :nums2) {
            set2.add(i);
        }

        for (int i : set1) {
            if (!set2.contains(i)) {
                list2.add(i);
            }
        }

        for (int i : set2) {
            if (!set1.contains(i)) {
                list1.add(i);
            }
        }
        
        res.add(list2);
        res.add(list1);

        return res;
    }
}
// @lc code=end

