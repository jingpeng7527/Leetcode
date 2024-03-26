/*
 * @lc app=leetcode id=1161 lang=java
 *
 * [1161] Maximum Level Sum of a Binary Tree
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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int res = -0x3f3f3f3;
        // int n = 1;
        queue.offer(root);
        int resLayer = 0;
        int curLayer = 1;

        while (!queue.isEmpty()) {

            int len = queue.size();
            int curRes = 0;
            

            for (int i = 0; i < len; i++) {
                TreeNode cur = queue.poll();
                if (cur.left != null) {
                    queue.offer(cur.left);
                    // n++;
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                    // n++;
                }
                curRes += cur.val;
            }

            // System.out.println("lllllll" + curRes + " " + res + " " + curLayer + ". "
            // + resLayer);
            if (res < curRes) {
                res = curRes;
                resLayer = curLayer;
            }
            curLayer++;

            // System.out.println(curRes + " " + res + " " + curLayer + ". "
            // + resLayer);
        }
        return resLayer;
    }
}
