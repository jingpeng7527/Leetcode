/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        // StringBuilder sb1 = new StringBuilder(word1);
        // StringBuilder sb2 = new StringBuilder(word2);
        StringBuilder res = new StringBuilder();
        int i = 0;
        int j = 0;

        // while (i <= word1.length() - 1 && j <= word2.length() - 1) {
        //     res.append(word1.charAt(i++));
        //     res.append(word2.charAt(j++));
        // }

        // while (i <= word1.length()-1) {
        //     res.append(word1.charAt(i++));
        // }

        // while (j <= word2.length()-1) {
        //     res.append(word2.charAt(j++));
        // }

        int m = word1.length(), n = word2.length();
        while (i < m || j < n) {
            if (i < m) {
                res.append(word1.charAt(i));
                ++i;
            }
            if (j < n) {
                res.append(word2.charAt(j));
                ++j;
            }
        }

        return res.toString();
    }
}
// @lc code=end

