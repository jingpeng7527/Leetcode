/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> tmp = new ArrayList<>();
        // boolean[] used = new boolean[n];
        additem(n, k, tmp, 1);
        return list;
    }
    
    public void additem(int n, int k, List<Integer> tmp, int start) {
        if (tmp.size() == k) {
            list.add(new ArrayList<>(tmp));
        }
        
        for (int i = start; i <= n; i++) {
            tmp.add(i);
            additem(n, k, tmp, i+1);
            tmp.remove(tmp.indexOf(i));
        }
    }
}
// @lc code=end

