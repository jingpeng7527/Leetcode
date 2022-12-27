import java.util.*;

/*
 * @lc app=leetcode id=150 lang=java
 *
 * [150] Evaluate Reverse Polish Notation
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") ){
                stack.push(stack.pop() + stack.pop());
            } else if (tokens[i].equals("-") ){
                stack.push(-stack.pop() + stack.pop());
            } else if (tokens[i].equals( "*") ){
                stack.push(stack.pop() * stack.pop());
            } else if (tokens[i].equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push( num2/ num1);
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
// @lc code=end

