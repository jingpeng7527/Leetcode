import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode id=429 lang=java
 *
 * [429] N-ary Tree Level Order Traversal
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        // dfs(root, 0, list);
        bfs(root, list);
        return list;
    }

    public void bfs(Node node, List<List<Integer>> list) {
        if (node == null) {
                    return;
                }
        Queue<Node> que = new LinkedList<>();
        que.add(node);

        
        while (!que.isEmpty()) {
            int len = que.size();
            List<Integer> re = new ArrayList<>();
            while (len > 0) {
                Node tr = que.poll();
                List<Node> child = tr.children;

                re.add(tr.val);

                for (Node node2 : child) {
                    que.add(node2);
                }
                len--;
            }
            list.add(re);
        }
        

    }
    // public void dfs(Node treeNode, int lier, List<List<Integer>> list) {
    //     if (treeNode == null) {
    //         return;
    //     }

    //     lier++;
    //     List<Node> tier = treeNode.children;

    //     if (list.size()<lier) {
    //         list.add(new ArrayList<Integer>());
    //     }
    //         list.get(lier - 1).add(treeNode.val);

    //     for (Node node : tier) {
    //         dfs(node, lier, list);
    //     }
    // }
}
// @lc code=end

