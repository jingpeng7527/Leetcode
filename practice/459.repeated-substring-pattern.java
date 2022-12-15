/*
 * @lc app=leetcode id=459 lang=java
 *
 * [459] Repeated Substring Pattern
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // 1. n^2
        for (int i = 1; i <= s.length() / 2; i++) {
            if (isreapted(s.substring(i), s.substring(0, i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isreapted(String s, String to) {
        if (s.isEmpty() || s == null) {
            return true;
        }
        if (!s.startsWith(to)) {
            return false;
        }
        return isreapted(s.substring(to.length()), to);
    }

    //2. KMP 没看懂nm


}
// @lc code=end
