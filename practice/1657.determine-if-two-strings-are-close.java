/*
 * @lc app=leetcode id=1657 lang=java
 *
 * [1657] Determine if Two Strings Are Close
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] charMap1 = new int[26];
        int[] charMap2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            charMap1[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            charMap2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < charMap2.length; i++) {
            if (charMap1[i] + charMap2[i] == 0) {
                continue;
            }
            if (charMap1[i] == 0 || charMap2[i] == 0) {
                return false;
                // System.out.println("ww");
            }
        }

        Arrays.sort(charMap1);
        Arrays.sort(charMap2);

        for (int i = 0; i < charMap2.length; i++) {
            if (charMap1[i] != charMap2[i]) {
                return false;
            }
        }



        // int[] charMap = new int[26];

        // HashMap<Integer, Integer> numMap = new HashMap<>();
        // HashMap<Character, Integer> map = new HashMap<>();

        // for (int i = 0; i < word1.length(); i++) {
        //     map.put(word1.charAt(i), map.getOrDefault(word1.charAt(i), 0) + 1);
        //     charMap[word1.charAt(i) - 'a'] =1;
        // }

        // for (Character ch : map.keySet()) {
        //     if (map.get(ch) != 0) {
        //         numMap.put(map.get(ch), numMap.getOrDefault(map.get(ch), 0) + 1);
        //     }
        //     // System.out.println(ch+ " d " + map.get(ch));
        // }
        
        // map = new HashMap<>();

        // for (int i = 0; i < word2.length(); i++) {
        //     map.put(word2.charAt(i), map.getOrDefault(word2.charAt(i), 0) + 1);
        //     charMap[word2.charAt(i) - 'a'] = 0;
        // }

        // for (Character ch : map.keySet()) {
        //     if (map.get(ch) != 0) {
        //         numMap.put(map.get(ch), numMap.getOrDefault(map.get(ch), 0) - 1);
        //     }
        //     // System.out.println(ch+ " dasdad " + map.get(ch));
        // }
        
        // for (int ch : numMap.keySet()) {
        //     if (numMap.get(ch) != 0) {
        //         return false;
        //     }
        //     // System.out.println(ch+ " ddad " + numMap.get(ch));
        // }

        // for (int i = 0; i < charMap.length; i++) {
        //     if (charMap[i] != 0) {
        //         return false;
        //     }
        //     // System.out.println(charMap[i]);
        // }
        
        return true;
    }
}
// @lc code=end

