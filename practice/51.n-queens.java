/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        List<String> board = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append('.');
            }
            board.add(sb.toString());
        }

        additem(board, 0, n);

        return res;
    }

    public void additem(List<String> board, int row, int n) {
        if (row == n) {
            res.add(new ArrayList<>(board));
        }

        for (int i = 0; i < n; i++) {
            if (!isvalid(board, i, row, n)) {
                continue;
            }
            StringBuilder sb = new StringBuilder(board.get(row));
            sb.setCharAt(i, 'Q');
            board.set(row, sb.toString());

            additem(board, row + 1, n);

            sb.setCharAt(i, '.');
            board.set(row, sb.toString());
        }

    }

    public boolean isvalid(List<String> board, int col, int row, int n) {
        // if col isvaild
        for (int i = 0; i < row; i++) {
            if (board.get(i).charAt(col) == 'Q') {
                return false;
            }
        }

        // if leftover is valid
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        // if rightover is valid
        for (int i = row-1, j = col+1; i >= 0 && j < n; i--, j++) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        return true;

    }
}
// @lc code=end
