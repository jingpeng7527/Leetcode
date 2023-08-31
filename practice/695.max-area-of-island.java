/*
 * @lc app=leetcode id=695 lang=java
 *
 * [695] Max Area of Island
 */

// @lc code=start
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        // for (int i = 0; i < grid.length; i++) {
        // dfs(i, 0, grid);
        // dfs(i, grid[0].length - 1, grid);
        // }

        // for (int i = 0; i < grid[0].length; i++) {
        // dfs(0, i, grid);
        // dfs(grid.length - 1, i, grid);
        // }

    //     for (int i = 0; i < grid.length; i++) {
    //         for (int j = 0; j < grid[0].length; j++) {
    //             if (grid[i][j] == 1) {
    //                 res = Math.max(dfs(0, i, j, grid), res);
    //             }
    //         }
    //     }
    //     return res;
    // }

        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    // 淹没岛屿，并更新最大岛屿面积
                    res = Math.max(res, dfs(grid, i, j));
                }
            }
        }
        return res;
    }

    // public int dfs(int count, int i, int j, int[][] grid) {
    //     if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
    //         return count;
    //     }

    //     if (grid[i][j] == 0) {
    //         return count;
    //     }

    //     grid[i][j] = 0;
    //     count++;

    //     count = dfs(count, i - 1, j, grid);
    //     count = dfs(count, i, j - 1, grid);
    //     count = dfs(count, i + 1, j, grid);
    //     count = dfs(count, i, j + 1, grid);

    //     return count;
    // }

    // 淹没与 (i, j) 相邻的陆地，并返回淹没的陆地面积
    int dfs(int[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n) {
            // 超出索引边界
            return 0;
        }
        if (grid[i][j] == 0) {
            // 已经是海水了
            return 0;
        }
        // 将 (i, j) 变成海水
        grid[i][j] = 0;

        return dfs(grid, i + 1, j)
            + dfs(grid, i, j + 1)
            + dfs(grid, i - 1, j)
            + dfs(grid, i, j - 1) + 1;
    }

}
// @lc code=end
