/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size != 0) {
                TreeNode cur = queue.poll();
                if (cur.left == null && cur.right == null) {
                    return depth+1;
                }
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
                size--;
            }
            depth++;
        }

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

