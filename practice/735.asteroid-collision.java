/*
 * @lc app=leetcode id=735 lang=java
 *
 * [735] Asteroid Collision
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

class Solution {
    Deque<Integer> stack = new ArrayDeque<>();
    public int[] asteroidCollision(int[] asteroids) {
       
        for (int i = 0; i < asteroids.length; i++) {
            judge(asteroids, i);
        }

        int[] res = new int[stack.size()];
        int i = stack.size() - 1;

        while (!stack.isEmpty()) {
            res[i--] = stack.pop();
        }
        return res;
    }
    
    public void judge(int[] asteroids, int i) {
        if (!stack.isEmpty()) {
            int cur = stack.peek();
            if (cur * asteroids[i] > 0 || asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                if (Math.abs(cur) == Math.abs(asteroids[i])) {
                    stack.pop();
                } else if (Math.abs(cur) < Math.abs(asteroids[i])) {
                    stack.pop();
                    judge(asteroids, i);
                }
            }
        } else {
            stack.push(asteroids[i]);
        }
    }
}
// @lc code=end

