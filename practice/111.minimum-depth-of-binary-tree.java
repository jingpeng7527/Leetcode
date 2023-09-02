/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
 */

// @lc code=start

import java.util.Queue;

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
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                TreeNode cur = queue.poll();
                if (cur.left == null & cur.right == null) {
                    return depth;
                }
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            depth++;
        }

        // queue.offer(root);
        // int depth = 0;

        // while (!queue.isEmpty()) {
        //     int size = queue.size();
        //     while (size != 0) {
        //         TreeNode cur = queue.poll();
        //         if (cur.left == null && cur.right == null) {
        //             return depth+1;
        //         }
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

        return depth;

        // else {
        //     int maxLeft = minDepth(root.left);
        //     int maxRight = minDepth(root.right);
        //     if (maxLeft==0) {
        //         return maxRight + 1;
        //     } else if (maxRight == 0) {
        //         return maxLeft + 1;
        //     } else{
        //         return Math.min(maxLeft, maxRight) + 1;
        //     }
        // }
    }
}
// @lc code=end

