/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        // int[] cur = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            // cur[ransomNote.charAt(i) - 'a']++;

            count[ransomNote.charAt(i) - 'a']--;
            if (count[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        // for (int i = 0; i < 26; i++) {
        //     if (cur[i] > count[i]) {
        //         return false;
        //     }
        // } 

        return true;
    }
}
// @lc code=end

