/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    // time=O(n^2) space=O(1)
    // 1. transpose
    // 2. reverse each row
    // 1 2 3     1 4 7     7 4 1
    // 4 5 6  => 2 5 8  => 8 5 2
    // 7 8 9     3 6 9     9 6 3
    
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int m = 0;
            int j = matrix.length - 1;
            while (m < j) {
                int temp = matrix[i][m];
                matrix[i][m] = matrix[i][j];
                matrix[i][j] = temp;
                m++;
                j--;
            }
        }
    }
}
// @lc code=end
