/*
 * @lc app=leetcode.cn id=806 lang=java
 *
 * [806] 写字符串需要的行数
 */

// @lc code=start
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int line = 1;
        int b = 0;

        for (int i = 0; i < s.length(); i++) {
            int need = widths[s.charAt(i) - 'a'];
            b += need;
            if (b > 100) {
                line++;
                b = need;
            }
        }

        return new int[] { line, b };
    }
}
// @lc code=end