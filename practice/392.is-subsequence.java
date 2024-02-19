/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (t.charAt(j) == s.charAt(i)) {
                count++;
                i++;
            }
            j++;
        }

        return count == s.length();
    }
}
// @lc code=end
