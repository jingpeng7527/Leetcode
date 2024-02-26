/*
 * @lc app=leetcode id=2352 lang=java
 *
 * [2352] Equal Row and Column Pairs
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap<>();
        int res =0;

        for (int i = 0; i < grid.length; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < grid[0].length; j++) {
                s = s.append(" ").append(grid[i][j]);
            }
            map.put(s.toString(), map.getOrDefault(s.toString(), 0) + 1);
        }

        for (int i = 0; i < grid.length; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < grid[0].length; j++) {
                s = s.append(" ").append(grid[j][i]);
            }
            if (map.containsKey(s.toString())) {
                res+=map.get(s.toString());
            }
        }

        return res;

    }
}
// @lc code=end

