/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */

// @lc code=start

import java.util.LinkedList;
import java.util.List;

class Solution {
    // 记录一次递归堆栈中的节点
    boolean[] onPath;
    // 记录遍历过的节点，防止走回头路
    boolean[] visited;
    // 记录图中是否有环
    boolean hasCycle = false;

    // 1. onpath[i] = true 表示当前正在访问
    // 2. visited[i] = true 表示已经访问过了
    // 3. 一旦发现当前访问的节点已经被访问过了，说明图中存在环
    // 4. 一旦发现已经存在环，立即返回
    // 5. 递归返回时，将onpath[i]设置为false，表示该节点访问完毕
    // 6. 如果图中所有节点访问完毕，仍未发现环，则不存在环
    // 7. 由于是有向图，因此每个节点只需要遍历一次
    // 8. 时间复杂度为O(N + M)，空间复杂度为O(N)
    // 9. N为节点个数，M为边的个数
    // 10. 本题中，N为课程数，M为先修课程的要求数

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // add all the edge to a graph
        List<Integer>[] graph = new LinkedList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new LinkedList<>();
        }

        for (int[] each : prerequisites) {
            graph[each[0]].add(each[1]);
        }

        visited = new boolean[numCourses];
        onPath = new boolean[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            traverse(graph, i);
        }

        return !hasCycle;
    }

    public void traverse( List<Integer>[] graph, int n) {
        if (onPath[n]) {
            hasCycle = true;
        }

        if (hasCycle || visited[n]) {
            return;
        }

        visited[n] = true;

        onPath[n] = true;

        for (int m:graph[n]) {
            traverse(graph, m);
        }
        
        onPath[n] = false;
    }

}
// @lc code=end

