/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(list, target, candidates, 0, 0);
        
        return res;
    }

    private void backtracking(List<Integer> list, int target, int[] candidates, int sum, int start) {
        
        if (sum == target) {
            res.add(new ArrayList<>(list));
            // for (int j : list) {
            //     System.out.println(j);
            // }
            // for (List<Integer> list2 : res) {

            //     for (Integer integer : list2) {
            //         System.out.println(integer);
            //     }
            // }
            return;
        }


        for (int i = start; i < candidates.length; i++) {
            // System.out.println(i +"   "+start);
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            
            if (sum + candidates[i]  > target) {
                break;
            }
            
            list.add(candidates[i]);
            sum += candidates[i];
            // System.out.println("ss" + start);
            // for (int j : list) {
            //     System.out.println(j);
            // }
            // start++;
            
            backtracking(list, target, candidates, sum, i+1 );
            sum -= candidates[i];
            list.remove(list.size() - 1);
            // System.out.println("flsas" + start);

        }

    }
}
// @lc code=end

