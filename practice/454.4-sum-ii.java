import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=454 lang=java
 *
 * [454] 4Sum II
 */

// @lc code=start
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int temp;
        int count = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                temp = i + j;
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
        }

        for (int i : nums3) {
            for (int j : nums4) {
                temp = i + j;
                if (map.containsKey(0 - temp)) {
                    count+=map.get(0-temp);
                }
            }
        }

        return count;
    }
}
// @lc code=end
