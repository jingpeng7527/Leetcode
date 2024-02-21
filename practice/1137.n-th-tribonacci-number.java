/*
 * @lc app=leetcode id=1137 lang=java
 *
 * [1137] N-th Tribonacci Number
 */

// @lc code=start
class Solution {
    int[] bonacci = new int[38];
    public int tribonacci(int n) {
        
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int a = 0, b = 1, c = 1;
        for (int i = 3; i < n+1; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
        // if (bonacci[n] != 0) {
        //     return bonacci[n];
        // }
        // bonacci[n] = tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
        // return bonacci[n];
    }
}
// @lc code=end
