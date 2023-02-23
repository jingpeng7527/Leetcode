import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;

        // Queue<TreeNode> nodes = new LinkedList<>();
        // nodes.add(root);
        // int len = nodes.size();

        // while (!nodes.isEmpty()) {
        //     len = nodes.size();
        //     while (len > 0) {
        //         TreeNode now = nodes.poll();
        //         // if (now.left != null now.right != null) {
        //         TreeNode temp = now.left;
        //         now.left = now.right;
        //         now.right = temp;
        //         if (now.left != null)
        //             nodes.offer(now.left);
        //         if (now.right != null)
        //             nodes.offer(now.right);
        //         // }
        //         len--;
        //     }

        // }
        // return root;
    }
}
// @lc code=end
