/*
 * @lc app=leetcode id=216 lang=java
 *
 * [216] Combination Sum III
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k, n, 1, 0, new ArrayList<>());
        return res;
    }
    public void backtracking(int k, int n, int cur, int sum, List<Integer> curL) {
        if (sum < n && curL.size() >= k) {
            return;
        }
        if (sum > n || curL.size() > k) {
            return;
        }
        if (sum == n && curL.size() == k) {
            res.add(new ArrayList(curL));
            // for(int i: curL){
            //     System.out.print(i);
            // }
            return;
        }

        for (int i = cur; i < 10; i++) {
            curL.add(i);
            backtracking(k, n, i+1, sum + i, curL);
            curL.remove(curL.size() - 1);
        }
    }
}
// @lc code=end

