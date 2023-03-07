import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longeststr = 0;
        for (int i : nums) {
            set.add(i);
        }

        for (int i : set) {
            if (!set.contains(i - 1)) {
                int curnum = i;
                int curstr = 1;

                while (set.contains(curnum + 1)) {
                    curnum++;
                    curstr++;
                }

                longeststr = Math.max(longeststr, curstr);
            }

        }
        return longeststr;
    }
}
// @lc code=end

