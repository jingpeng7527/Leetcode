/*
 * @lc app=leetcode id=1254 lang=java
 *
 * [1254] Number of Closed Islands
 */

// @lc code=start
class Solution {

    // for the edge point:
    //    if it is sea, skip
    //    if it is land, use dfs to draw it and its adjacent land( cuz no matter they are sea or land, they won’t be insolate land)
    // for the rest , count the number of lands and do the dfs as usual
    
    public int closedIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            dfs(i, 0, grid);
            dfs(i, grid[0].length - 1, grid);
        }
        
        for (int i = 0; i < grid[0].length; i++) {
            dfs(0, i, grid);
            dfs(grid.length - 1, i, grid);
        }
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    res++;
                    dfs(i, j, grid);
                }
            }
        }
        return res;

    }
    
    public void dfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return;
        }
        
        if (grid[i][j] == 1) {
            return;
        }
        
        grid[i][j] = 1;

        dfs(i - 1, j, grid);
        dfs(i, j - 1, grid);
        dfs(i + 1, j, grid);
        dfs(i, j+1, grid);
    }
}
// @lc code=end

