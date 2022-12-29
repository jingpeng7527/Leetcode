import java.util.*;

/*
 * @lc app=leetcode id=1200 lang=java
 *
 * [1200] Minimum Absolute Difference
 */

// @lc code=start
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int count = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i + 1] - arr[i];
            if (temp < count) {
                ans.clear();
                count = temp;
            }

            if (temp == count) {

                List<Integer> cur = new ArrayList<>();
                cur.add(arr[i]);
                cur.add(arr[i + 1]);
                ans.add(cur);

            }

        }

        return ans;

    }
}
// @lc code=end
