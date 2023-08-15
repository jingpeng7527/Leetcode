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
        if (s == null || s.length() == 0 || t == null || t.length() == 0){
            return "";
        }
        int[] need = new int[128];
        //记录需要的字符的个数
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }
        //l是当前左边界，r是当前右边界，size记录窗口大小，count是需求的字符个数，start是最小覆盖串开始的index
        int l = 0, r = 0, size = Integer.MAX_VALUE, count = t.length(), start = 0;
        //遍历所有字符
        while (r < s.length()) {
            char c = s.charAt(r);
            if (need[c] > 0) {//需要字符c
                count--;
            }
            need[c]--;//把右边的字符加入窗口
            if (count == 0) {//窗口中已经包含所有字符
                while (l < r && need[s.charAt(l)] < 0) {
                    need[s.charAt(l)]++;//释放右边移动出窗口的字符
                    l++;//指针右移
                }
                if (r - l + 1 < size) {//不能右移时候挑战最小窗口大小，更新最小窗口开始的start
                    size = r - l + 1;
                    start = l;//记录下最小值时候的开始位置，最后返回覆盖串时候会用到
                }
                //l向右移动后窗口肯定不能满足了 重新开始循环
                need[s.charAt(l)]++;
                l++;
                count++;
            }
            r++;
        }
        return size == Integer.MAX_VALUE ? "" : s.substring(start, start + size);
        
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


        // Map<Character, Integer> map1 = new HashMap<>();
        // Map<Character, Integer> map2 = new HashMap<>();

        // for (char c : t.toCharArray()) {
        //     map1.put(c, map1.getOrDefault(c, 0) + 1);
        // }

        // int need = map1.size();
        // int have = 0;
        // int left = 0;
        // String res = s+"88";

        // for (int right = 0; right < s.length(); right++) {
        //     char c = s.charAt(right);
        //     map2.put(c, map2.getOrDefault(c, 0) + 1);
        //     if (map1.containsKey(c) && map1.get(c).equals(map2.get(c))) {
        //         have++;
        //     }

        //     while (have == need) {
        //         res = res.length() <= right - left ? res : s.substring(left, right+1);
                
        //         char cc = s.charAt(left);
        //         map2.put(cc, map2.getOrDefault(cc, 0) - 1);
        //         if (map1.containsKey(cc) && map1.get(cc) > map2.get(cc)) {
        //             have--;
        //         }
        //         left++;
        //     }
            
        // }

        // if (res.equals(s+"88")) {
        //     return "";
        // } else {
        //     return res;
        // }

    }
}
// @lc code=end
