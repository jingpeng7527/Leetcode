/*
 * @lc app=leetcode id=76 lang=java
 *
 * [76] Minimum Window Substring
 */

// @lc code=start

import java.util.Map;
import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        // 1. use two pointers to find the window
        // 2. use map to store the number of each character in t
        // 3. use map to store the number of each character in current sliding window
        // 4. use two variables to store the number of characters in t and current
        // sliding window (have and need)
        // 5. if the window contains all the characters in t, move the left pointer to
        // find the minimum window
        // 6. if the window does not contain all the characters in t, move the right
        // pointer to find the window
        // 7. return the minimum window


        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : t.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int need = map1.size();
        int have = 0;
        int left = 0;
        String res = s+"88";

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
            if (map1.containsKey(c) && map1.get(c).equals(map2.get(c))) {
                have++;
            }

            while (have == need) {
                res = res.length() <= right - left ? res : s.substring(left, right+1);
                
                char cc = s.charAt(left);
                map2.put(cc, map2.getOrDefault(cc, 0) - 1);
                if (map1.containsKey(cc) && map1.get(cc) > map2.get(cc)) {
                    have--;
                }
                left++;
            }
            
        }

        if (res.equals(s+"88")) {
            return "";
        } else {
            return res;
        }

    }
}
// @lc code=end
