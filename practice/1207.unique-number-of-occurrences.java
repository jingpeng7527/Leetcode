/*
 * @lc app=leetcode id=1207 lang=java
 *
 * [1207] Unique Number of Occurrences
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // for (int i : map.keySet()) {
        //     set.add(map.get(i));
        // }
        // return map.size() == set.size();
        return map.size() == new HashSet<>(map.values()).size();
    }
}
// @lc code=end

