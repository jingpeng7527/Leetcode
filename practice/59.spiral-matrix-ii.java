/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int i, j;
        int loop = 0;
        int start = 0;
        int count = 1;
        int[][] matrix = new int[n][n];

        while (loop++ < n / 2) {
            // 从左到右
            for (i = start; i < n - loop; i++) {
                matrix[start][i] = count++;
            }
            // 上到下
            for (j = start; j < n - loop; j++) {
                matrix[j][i] = count++;
            }
            // right to left
            for (; j >= loop; j--) {
                matrix[i][j] = count++;
            }
            for (; i >= loop; i--) {
                matrix[i][start] = count++;
            }
            start++;
        }

        if (n % 2 == 1) {
            matrix[start][start] = count;
        }
        return matrix;
    }
}
// @lc code=end
