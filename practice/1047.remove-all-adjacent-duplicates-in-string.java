import java.util.*;

/*
 * @lc app=leetcode id=1047 lang=java
 *
 * [1047] Remove All Adjacent Duplicates In String
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (sb.length() != 0 && s.charAt(i) == sb.charAt(sb.length() - 1)) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();


        // Deque<Character> stack = new LinkedList<>();
        // stack.push(s.charAt(0));

        // for (int i = 1; i < s.length(); i++) {

        //     if ( !stack.isEmpty() && s.charAt(i) == stack.peek()) {
        //         stack.pop();
        //     } else {
        //         stack.push(s.charAt(i));
        //     }
        // }

        // // String str = "";
    
        // // while (!stack.isEmpty()) {
        // //     str = stcak.pop() + str;
        // // }

        // // return str;

        // StringBuilder sb = new StringBuilder("");
        // while (!stack.isEmpty()) {
        //     sb.append(stack.pop());
        // }
        // return sb.reverse().toString();
    }
}
// @lc code=end

