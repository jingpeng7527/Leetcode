/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start
class Solution {
    public int characterReplacement(String s, int k) {
        if (s.length() < 1)
            return 0;
        else if (s.length() < 2)
            return 1;
            
        int left = 0;
        int right = 0;
        int[] count = new int[26];
        int maxCount = 0;
        int res = 0;

        while (right!=s.length()) {
            count[s.charAt(right) - 'A'] ++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);
            if (right - left + 1 - maxCount > k) {               
                count[s.charAt(left) - 'A'] -= 1;
                left++;
            }
            res = Math.max(right-left+1, res);
            right++;

            // System.out.println(left+" "+right);
        }
        return res;
    }
}
// @lc code=end

