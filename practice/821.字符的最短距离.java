import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=821 lang=java
 *
 * [821] 字符的最短距离
 */

// @lc code=start
class Solution {
    // List<Integer> list = new ArrayList<>();

    public int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] ans = new int[n];

        for (int i = 0, idx = -n; i < n; ++i) {
            if (s.charAt(i) == c) {
                idx = i;
            }
            ans[i] = i - idx;
        }

        for (int i = n - 1, idx = 2*n; i >= 0; --i) {
            if (s.charAt(i) == c) {
                idx = i;
            }
            ans[i] = Math.min(ans[i], idx - i);
        }

        return ans;

        // int[] answer = new int[s.length()];
        // for (int i = 0; i < s.length(); i++) {
        // if (s.charAt(i) == c) {
        // list.add(i);
        // }
        // }

        // for (int i = 0; i < answer.length; i++) {
        // answer[i] = countt(i);
        // }

        // return answer;
        // }

        // public int countt(int x) {
        // int i = 0;
        // int min = Math.abs(list.get(i) - x);
        // int count = Integer.MAX_VALUE;

        // while (i < list.size()) {

        // count = Math.abs(list.get(i) - x);
        // i++;
        // if (count < min) {
        // min = count;
        // }
        // // System.out.println("s" + count);
        // }

        // return min;

    }
}
// @lc code=end
