/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backTracking(n, n, sb, res);
        return res;
    }

    public void backTracking(int left, int right, StringBuilder sb, List<String> res) {
        if (left < 0 || right < 0 || left > right)
            return;
        
        if (left == 0 && right == 0) {
            res.add(sb.toString());
            return;
        }
        
        sb.append("(");// 选择
        backTracking(left - 1, right, sb, res);
        sb.deleteCharAt(sb.length() - 1);// 撤消选择

        sb.append(")");
        backTracking(left, right-1, sb, res);
        sb.deleteCharAt(sb.length() - 1);
    }


    // public void backTracking(int n, List<String> res, int left, int right, String str) {
    //     if (right > left) {
    //         return;
    //     }
    //     if (left == right && left == n) {
    //         res.add(str);
    //         return;
    //     }
        
    //     if (left < n) {
    //         backTracking(n, res, left + 1, right, str + "(");
    //     }
        
    //     if (right < left) {
    //         backTracking(n, res, left, right+1, str+")");
    //     }

    // }
}
// @lc code=end

