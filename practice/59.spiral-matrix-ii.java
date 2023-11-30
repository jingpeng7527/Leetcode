/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int num = 1;
        int u = 0;
        int d = n - 1;
        int l = 0;
        int r = n - 1;
        int[][] matrix = new int[n][n];

        while (num <= n * n) {
            if (u <= d) {
                for (int i = l; i <= r; i++) {
                    matrix[u][i] = num++;
                    // System.out.println(num);
                }
                u++;
            }

            if (l <= r) {
                for (int i = u; i <= d; i++) {
                    matrix[i][r] = num++;
                    // System.out.println(num + "m");
                }
                r--;
            }

            if (u <= d) {
                for (int i = r; i >= l; i--) {
                    matrix[d][i] = num++;
                    // System.out.println(num);
                }
                d--;
            }

            if (l <= r) {
                for (int i = d; i >= u; i--) {
                    matrix[i][l] = num++;
                    // System.out.println(num + "k");
                }
                l++;
            }
        }

        return matrix;

        // int i, j;
        // int loop = 0;
        // int start = 0;
        // int count = 1;
        // int[][] matrix = new int[n][n];

        // while (loop++ < n / 2) {
        // // 从左到右
        // for (i = start; i < n - loop; i++) {
        // matrix[start][i] = count++;
        // }
        // // 上到下
        // for (j = start; j < n - loop; j++) {
        // matrix[j][i] = count++;
        // }
        // // right to left
        // for (; j >= loop; j--) {
        // matrix[i][j] = count++;
        // }
        // for (; i >= loop; i--) {
        // matrix[i][start] = count++;
        // }
        // start++;
        // }

        // if (n % 2 == 1) {
        // matrix[start][start] = count;
        // }
        // return matrix;
    }
}
// @lc code=end
