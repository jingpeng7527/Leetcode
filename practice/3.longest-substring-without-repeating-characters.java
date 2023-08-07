import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        // 1. use hashmap to store the index of each char
        // 2. use left pointer to test if there is any repeating character  
        //  if yes, change the left(start pointer)  
        // important: need to judge if the repeating postion is before or after the current left
        // if it is before, no need to change left; if after, change it to the repeating position+1
        // 3. update the max 
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int max = 0;

        while (right<s.length()) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right), right);
            max = Math.max(max, right-left+1);
            right++;
        }
            
        return max;
        // int left = 0;
        // int max = 0;
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     if (map.containsKey(s.charAt(i))) {
        //         left = Math.max(left, map.get(s.charAt(i)) + 1);
        //     }
        //     map.put(s.charAt(i), i);
        //     max = Math.max(max, i-left+1);
        // }
        // return max;
    }
}
// @lc code=end

