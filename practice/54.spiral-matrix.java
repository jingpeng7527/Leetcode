import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // List<Integer> list = new ArrayList<Integer>();
        // int startx = 0;
        // int starty = 0;
        // int loop = 0;
        // // int count = 1;
        // int i, j;
        // int n = matrix.length;
        // System.out.println(n);
        // int m = matrix[0].length;
        // System.out.println(m);

        // while (loop++ < Math.min(m, n) / 2) {

        // for (i = startx; i < m - loop; i++) {
        // list.add(matrix[startx][i]);
        // }
        // // System.out.println(list.toString());
        // for (j = starty; j < n - loop; j++) {
        // list.add(matrix[j][i]);
        // }
        // // System.out.println(list.toString());
        // for (; i >= loop; i--) {
        // list.add(matrix[j][i]);
        // }
        // // System.out.println(list.toString());
        // for (; j >= loop; j--) {
        // list.add(matrix[j][starty]);
        // }
        // // System.out.println(list.toString());
        // startx++;
        // starty++;

        // }

        // // when Math.min(m, n) % 2 ==1

        // if (Math.min(m, n) % 2 == 1) {
        // if (m > n) {
        // for (int k = startx; k <= m - loop; k++) {
        // list.add(matrix[startx][k]);
        // }
        // } else {
        // for (int k = starty; k <= n - loop; k++) {
        // list.add(matrix[k][starty]);
        // }
        // }

        // }

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        List<Integer> list = new ArrayList<Integer>();
        if (matrix.length == 0) {
            return list;
        }

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int j = colBegin; j <= colEnd; j++) {
                list.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            // System.out.println(list.toString());
            for (int j = rowBegin; j <= rowEnd; j++) {
                list.add(matrix[j][colEnd]);
            }
            colEnd--;
            // System.out.println(list.toString());

            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    list.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            // System.out.println(list.toString());

            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--) {
                    list.add(matrix[j][colBegin]);
                }
            }
            colBegin++;
            // System.out.println(list.toString());

        }

        return list;
    }
}
// @lc code=end