import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        int[] countp = new int[26];
        int[] counts = new int[26];

        if (s.length() < p.length()) {
            return new ArrayList<Integer>();
        }


        for (int i = 0; i < p.length(); i++) {
            countp[p.charAt(i) - 'a']++;
            counts[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(countp, counts)) {
            list.add(0);
        }

        for (int i = 0; i < s.length() - p.length(); i++) {
            counts[s.charAt(i) - 'a']--;
            counts[s.charAt(i + p.length()) - 'a']++;

            if (Arrays.equals(countp, counts)) {
                list.add(i+1);
            }
        }

    
        // String t = s.substring(i, i + p.length());
        // System.out.println(t);
        // int[] counts = new int[26];

        // for (int j = 0; j < t.length(); j++) {
        // counts[t.charAt(j) - 'a']++;
        // }
        // // System.out.println(t);

        // if (Arrays.equals(countp, counts)) {
        // list.add(i);
        // }
        // }

        return list;
    }
}
// @lc code=end
