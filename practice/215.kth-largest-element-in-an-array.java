/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxqQueue = new PriorityQueue<>(Collections.reverseOrder());
        // maxqQueue.addAll(nums);
        for (Integer integer : nums) {
            maxqQueue.add(integer);
        }
        for (int i = 0; i < k-1; i++) {
            maxqQueue.poll();
        }
        return maxqQueue.poll();
    }
}
// @lc code=end