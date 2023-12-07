import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        
        // Queue<TreeNode> queue = new LinkedList<>();

        // queue.offer(root);
        // int depth = 0;

        // while (!queue.isEmpty()) {
        //     int size = queue.size();
        //     while (size != 0) {
        //         TreeNode cur = queue.poll();
        //         if (cur.left != null) {
        //             queue.offer(cur.left);
        //         }
        //         if (cur.right != null) {
        //             queue.offer(cur.right);
        //         }
        //         size--;
        //     }
        //     depth++;
        // }

        // return depth;

        // else {
        //     int maxLeft = maxDepth(root.left);
        //     int maxRight = maxDepth(root.right);
        //     return Math.max(maxLeft, maxRight) + 1;
        // }
    }
}
// @lc code=end

