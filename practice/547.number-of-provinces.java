/*
 * @lc app=leetcode id=547 lang=java
 *
 * [547] Number of Provinces
 */

// @lc code=start
class Solution {
    List<Integer> visited = new LinkedList<>();
    public int findCircleNum(int[][] isConnected) {
        int res = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited.contains(i)) {
                bfs(isConnected, i);
                res++;
            }
        }
        return res;
    }

    public void bfs(int[][] isConnected, int start) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(start);
        int layer = start;

        while (!que.isEmpty()) {
            layer = que.poll();

            if (visited.contains(layer)) {
                continue;
            }
            visited.add(layer);
            for (int i = 0; i < isConnected.length; i++) {
                if (isConnected[layer][i] == 1 && !visited.contains(i)) {
                    que.add(i);
                }
            }
        }
    }

}