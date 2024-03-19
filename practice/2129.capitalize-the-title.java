/*
 * @lc app=leetcode id=2129 lang=java
 *
 * [2129] Capitalize the Title
 */

// @lc code=start
class Solution {
    public String capitalizeTitle(String title) {
        int left = 0;
        int right = 0;
        char[] cur = title.toCharArray();
        while (right < title.length()) {
            // if (title.charAt(right) == ' ' || right == title.length() - 1) {
                while (right < title.length() && cur[right] != ' ') {
                    right++;
                }
                if (right - left > 2) {
                    if (cur[left] <= 'z' && cur[left] >= 'a') {
                        cur[left] = (char) (cur[left] - 'a' + 'A');
                    }
                    left++;
                }
                while (left != right) {
                    if (cur[left] <= 'Z' && cur[left] >= 'A') {
                        cur[left] = (char) (cur[left] - 'A' + 'a');
                    }
                    left++;
                }
                left++;
                right++;
            }
            // right++;
        // }
        return String.valueOf(cur);
    }
}
// @lc code=end

