/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;

        // Map<Integer, Integer> freqs = new HashMap<>();
	    // s.chars().forEach(ch -> freqs.put(ch, freqs.getOrDefault(ch, 0) + 1));
	    // t.chars().forEach(ch -> freqs.put(ch, freqs.getOrDefault(ch, 0) - 1));
	    // return freqs.values().stream().allMatch(x -> x == 0);

    }
}
// @lc code=end
