/*
 * @lc app=leetcode id=590 lang=java
 *
 * [590] N-ary Tree Postorder Traversal
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
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preorder1(root, list);
        return list;
    }

    public void preorder1(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        for (Node node : root.children) {
            preorder1(node, list);
        }
        list.add(root.val);
    }
}
    
// @lc code=end

