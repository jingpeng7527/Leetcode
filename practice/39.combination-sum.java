/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Deque<Integer> list = new ArrayDeque<>();
        backtrack(list, 0, candidates, target, 0);
        return res;
    }

    public void backtrack(Deque<Integer> list, int start,int[] candidates, int target, int current) {
        if (current == target) {
            res.add(new ArrayList<>(list));
            return;
        }

        if (current>target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            current += candidates[i];
            list.addLast(candidates[i]);
            backtrack(list, i, candidates, target, current);
            current -= candidates[i];
            list.removeLast();
        }
    }
}
// @lc code=end
