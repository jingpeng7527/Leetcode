/*
 * @lc app=leetcode id=933 lang=java
 *
 * [933] Number of Recent Calls
 */

// @lc code=start

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> queue = new LinkedList<>();

    public RecentCounter() {
        
    }

    public int ping(int t) {
        queue.add(t);

        while (queue.size() > 0 && t - queue.peek() > 3000)
            queue.poll();

        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
// @lc code=end

