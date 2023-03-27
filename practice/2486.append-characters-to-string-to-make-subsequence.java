/*
 * @lc app=leetcode id=2486 lang=java
 *
 * [2486] Append Characters to String to Make Subsequence
 */

// @lc code=start
class Solution {
    public int appendCharacters(String s, String t) {
        int p = 0;
        for (char i : s.toCharArray()) {
            if (i == t.charAt(p)) {
                p++;
            }
            if (p == t.length()) {
                break;
            }
        }
        return t.length() - p;
        // int i = 0;
        // int j = 0;
        // int result = 0;
        // while (i < s.length() && j < t.length()) {
        // // while () {
        // if (s.charAt(i) == t.charAt(j)) {
        // j++;
        // }
        // i++;
        // if (j == t.length()) {
        // result = 0;
        // break;
        // }
        // // }
        // if (i == s.length()) {
        // result = t.length() - j;
        // }

        // }
        // return result;
    }
}
// @lc code=end
