/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        // int[] ss = new int[26];
        // // int[] tt = new int[26];
        // char res = ' ';

        // for (int i = 0; i < s.length(); i++) {
        //     ss[s.charAt(i) - 'a']++;
        // }

        // for (int i = 0; i < t.length(); i++) {
        //     ss[t.charAt(i) - 'a']--;
        //     if (ss[t.charAt(i) - 'a'] <0) {
        //         res =  t.charAt(i);
        //     }
        // }
        // return res;
        int as = 0, at = 0;
        for (int i = 0; i < s.length(); ++i) {
            as += s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            at += t.charAt(i);
        }
        return (char) (at - as);
    }
}
// @lc code=end

