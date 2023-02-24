/*
 * @lc app=leetcode id=117 lang=java
 *
 * [117] Populating Next Right Pointers in Each Node II
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node now = root;
        

        while (now != null) {
            Node dummy = new Node(0);
            //pre表示访下一层节点的前一个节点
            Node pointer = dummy;

            while (now != null) {
                if (now.left != null) {
                    pointer.next = now.left;
                    pointer = pointer.next;
                }
                if (now.right != null) {
                    pointer.next = now.right;
                    pointer = pointer.next;
                }
                now = now.next;
            }
            now = dummy.next;
        }
        return root;   
    }
}
// @lc code=end

