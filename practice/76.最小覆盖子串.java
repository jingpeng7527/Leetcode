import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<Character, Integer>();
        Map<Character, Integer> window = new HashMap<Character, Integer>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int start = 0;
        int end = 0;

        int first = 0;

        int valid = 0;
        int len = Integer.MAX_VALUE;

        while (end < s.length()) {
            char x = s.charAt(end);
            end++;

            // 如果该字符等于所给字符串中的字符就可以放进去
            if (need.containsKey(x)) {
                window.put(x, window.getOrDefault(x, 0) + 1);
                if (window.get(x).equals(need.get(x))) {
                    valid++;
                    // 如果窗口中的该字符字数等于所给字符字数则有一个所需字符的个数已经满足要求
                }
            }

            // 当满足字符个数等于所给字符的个数时缩小窗口
            while (valid == need.size()) {
                if (end - start < len) {
                    first = start;
                    len = end - start;
                }

                char y = s.charAt(start);
                start++;

                // 如果该字符是所需字符时需要操作
                if (need.containsKey(y)) {
                    if (window.get(y).equals(need.get(y))) {
                        valid--;
                        // 如果窗口中的该字符字数等于所给字符字数则有一个所需字符的个数不满足要求
                    }
                    window.put(y, window.getOrDefault(y, 0) - 1);
                }

            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(first, first+len);
    }
}
// @lc code=end
