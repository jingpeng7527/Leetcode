/*
 * @lc app=leetcode id=216 lang=java
 *
 * [216] Combination Sum III
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        if (k <= 0 || n <= 0 || k > n) {
            return res;
        }

        if (n > (19 - k) * k / 2) {
            return res;
        }

        Deque<Integer> path = new ArrayDeque<>();
        backtracking(k, n, 1, path);
        return res;
    }

    public void backtracking(int k, int n, int cur, Deque<Integer> curL) {
        if (n > 0 && curL.size() >= k) {
            // for (int i : curL) {
            //     System.out.println(i +" >0");
            // }
            return;
        }
        if (n < 0 || curL.size() > k) {
            // for (int i : curL) {
            //     System.out.println(i+" <0");
            // }
            return;
        }
        if (n == 0 && curL.size() == k) {
            res.add(new ArrayList(curL));
            // for (int i : curL) {
            //     System.out.print(i);
            // }
            return;
        }

        for (int i = cur; i < 10; i++) {
            curL.addLast(i);
            backtracking(k, n - i, i + 1, curL);
            curL.removeLast();
        }
    }
}
// @lc code=end

