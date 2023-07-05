/*
 * @lc app=leetcode id=1456 lang=java
 *
 * [1456] Maximum Number of Vowels in a Substring of Given Length
 */

// @lc code=start
class Solution {
    public int maxVowels(String s, int k) {
        int res = 0;

        for (int i = 0; i < k; i++) {
            res += isVowel(s.charAt(i));
            // System.out.println(res+"  kk ");
        }
        int vowel_count = res;
        for (int i = k; i < s.length(); ++i) {
            vowel_count += isVowel(s.charAt(i)) - isVowel(s.charAt(i - k));
            res = Math.max(res, vowel_count);
        }
        
        
        return res;

    }
    
    public int isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ? 1 : 0;
    }
}
// @lc code=end

