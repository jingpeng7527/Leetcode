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
        backTracking(n, res, 0, 0, "");
        return res;
    }

    public void backTracking(int n, List<String> res, int left, int right, String str) {
        if (right > left) {
            return;
        }
        if (left == right && left == n) {
            res.add(str);
            return;
        }
        
        if (left < n) {
            backTracking(n, res, left + 1, right, str + "(");
        }
        
        if (right < left) {
            backTracking(n, res, left, right+1, str+")");
        }

    }
}
// @lc code=end

