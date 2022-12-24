import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                deque.push(')');
            } else if (s.charAt(i) == '{') {
                deque.push('}');
            } else if (s.charAt(i) == '[') {
                deque.push(']');
            } else if (deque.isEmpty() || s.charAt(i) != deque.peek()) {
                return false;
            } else {
                deque.pop();
            }
        }

        return deque.isEmpty();

    }
}
// @lc code=end
