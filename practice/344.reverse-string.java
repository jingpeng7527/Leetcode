/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        if (s.length == 0) {
            return;
        }

        recursion(s, 0, s.length-1);

        // if (s.length < 2) {
        //     return;
        // }
        // int left = 0;
        // int right = s.length - 1;

        // while (left < right) {
        //     char temp = s[left];
        //     s[left] = s[right];
        //     s[right] = temp;
        //     left++;
        //     right--;
        // }

    }
    
    public void recursion(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }
        recursion(s, left + 1, right - 1);
        char tmp = s[left];
        s[left] = s[right];
        s[right] = tmp;
    }
}
// @lc code=end

