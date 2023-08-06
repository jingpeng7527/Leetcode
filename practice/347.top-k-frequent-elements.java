import java.util.*;

/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2) -> pair1[1] - pair2[1]);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (pq.size() < k) {
                pq.add(new int[] { entry.getKey(), entry.getValue() });
            } else {
                if (entry.getValue() > pq.peek()[1]) {
                    pq.poll();
                    pq.add(new int[] { entry.getKey(), entry.getValue() });
                }
            }
        }

        for (int i = 0; i < k; i++) {
            res[i] = pq.poll()[0];
        }

        return res;
        
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i : nums) {
        //     map.put(i, map.getOrDefault(i, 0) + 1);
        // }

        // PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2) -> pair1[1] - pair2[1]);
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (pq.size() < k) {
        //         pq.add(new int[] { entry.getKey(), entry.getValue() });
        //     } else {
        //         if (pq.peek()[1] < entry.getValue()) {
        //             pq.poll();
        //             pq.add(new int[] { entry.getKey(), entry.getValue() });
        //         }
        //     }
        // }

        // int[] ans = new int[k];
        // for (int i = 0; i < k; i++) {// 依次从队头弹出k个,就是出现频率前k高的元素
        //     ans[i] = pq.poll()[0];
        // }

        // return ans;
    }
}
// @lc code=end
