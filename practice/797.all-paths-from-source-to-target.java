/*
 * @lc app=leetcode id=797 lang=java
 *
 * [797] All Paths From Source to Target
 */

// @lc code=start

import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new LinkedList<>();
        
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        LinkedList<Integer> path = new LinkedList<>();
        traverse(path, 0, graph);
        return res;
    }

    public void traverse(LinkedList<Integer> path, int start, int[][] graph) {
        path.add(start);

        if (start == graph.length - 1) {
            res.add(new LinkedList<>(path));
        }
            
        for (int is : graph[start]) {
            traverse(path, is, graph);
        }


        path.removeLast();
       
    }
}
// @lc code=end

