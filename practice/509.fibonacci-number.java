/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }else if(n==1){
            return 1;
        }
        return fib(n - 1) + fib(n-2);
    }
}
// @lc code=end

