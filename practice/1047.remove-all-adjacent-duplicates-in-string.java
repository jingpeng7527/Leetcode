import java.util.*;

/*
 * @lc app=leetcode id=1047 lang=java
 *
 * [1047] Remove All Adjacent Duplicates In String
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stcak = new LinkedList<>();
        stcak.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {

            if ( !stcak.isEmpty() && s.charAt(i) == stcak.peek()) {
                stcak.pop();
            } else {
                stcak.push(s.charAt(i));
            }
        }

        String str = "";
    
        while (!stcak.isEmpty()) {
            str = stcak.pop() + str;
        }

        return str;
    }
}
// @lc code=end

