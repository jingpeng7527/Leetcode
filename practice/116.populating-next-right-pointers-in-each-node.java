import java.util.Queue;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode id=116 lang=java
 *
 * [116] Populating Next Right Pointers in Each Node
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

        while (now.left!=null) {
            Node pointer = now;

            while (pointer != null) {
                pointer.left.next = pointer.right;
                if (pointer.next!=null) {
                    pointer.right.next = pointer.next.left;
                }
                pointer = pointer.next;
            }
            now = now.left;
        }

        // Queue<Node> nodes = new LinkedList<>();
        // nodes.add(root);
        // int len = nodes.size();

        // while (!nodes.isEmpty()) {
        //     len = nodes.size();
        //     while (len > 0) {
        //         Node now = nodes.poll();
        //         if (len > 1) {
        //             now.next = nodes.peek();
        //         }
                
        //         if (now.left != null)
        //             nodes.offer(now.left);
        //         if (now.right != null)
        //             nodes.offer(now.right);
        //         len--;
        //     }

        // }
        return root;
    }
}
// @lc code=end

