import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=567 lang=java
 *
 * [567] 字符串的排列
 */

// @lc code=start
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> need = new HashMap<Character, Integer>();
        Map<Character, Integer> window = new HashMap<Character, Integer>();

        int left = 0, right = 0;
        int valid = 0;

        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            need.put(a, need.getOrDefault(a, 0) + 1);
        }

        while (right < s2.length()) {
            char c = s2.charAt(right);
            right++;

            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            while (right - left >= s1.length())
            // while(valid==need.size())
            {
                if (valid == need.size()) {
                    return true;
                }

                char b = s2.charAt(left);
                left++;

                if (need.containsKey(b)) {
                    if (window.get(b).equals(need.get(b))) {
                        valid--;
                    }
                    window.put(b, window.getOrDefault(b, 0) - 1);
                }
            }

        }
        return false;
    }
}
// @lc code=end
