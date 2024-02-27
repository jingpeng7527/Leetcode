/*
 * @lc app=leetcode id=394 lang=java
 *
 * [394] Decode String
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String decodeString(String s) {
        Deque<String> sstack = new ArrayDeque<>();
        Deque<Integer> istack = new ArrayDeque<>();
        StringBuilder tmp = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                count = count * 10 + (ch - '0');
            } else if (ch - 'a' < 26 && ch - 'a' >= 0) {
                tmp.append(ch);
            }else if(ch == '['){
                istack.push(count);
                sstack.push(tmp.toString());
                count = 0;
                tmp = new StringBuilder();
            } else if (ch == ']') {
                
                int num = istack.pop();
                StringBuilder cur = new StringBuilder();
                
                for (int j = 0; j < num; j++) {
                    cur.append(tmp);
                }

                tmp = new StringBuilder(sstack.pop() + cur);
            }
        }

        return tmp.toString();
        
    }
}
// @lc code=end

