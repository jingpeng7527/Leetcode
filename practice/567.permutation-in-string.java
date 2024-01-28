/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

// @lc code=start
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length(), left = 0, right = 0;
        int[] count = new int[26];

        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++;
        }

        while (right < len2) {
            count[s2.charAt(right) - 'a']--;
            if (count[s2.charAt(right) - 'a'] < 0) {
                while (left <= right && count[s2.charAt(right) - 'a'] < 0) {
                    count[s2.charAt(left) - 'a']++;
                    left++;
                }
            } else if (right - left + 1 == len1) {
                return true;
            }
            right++;
        }
        
        return false;
    }
}
// @lc code=end

