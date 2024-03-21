/*
 * @lc app=leetcode id=1372 lang=java
 *
 * [1372] Longest ZigZag Path in a Binary Tree
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
    int res = 0;
    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(true, root.left, 1);
        dfs(false, root.right, 1);
        return res;
    }

    public void dfs(boolean left, TreeNode cur, int path) {
        
        if (cur == null) {
            // System.out.println(path);
            // res = Math.max(res, path);
            return;
        }

        res = Math.max(res, path);
        dfs(true, cur.left, left ? 1 : path + 1);
        dfs(false, cur.right, !left ? 1 : path + 1);

        // if (left) {
        //     // System.out.println(cur.val + " mm" + path);
        //     if (cur.right != null) {
        //         dfs(false, cur.right, path + 1);
        //     }
        //     if (cur.left != null) {
        //         // res = Math.max(res, path);
        //         dfs(true, cur.left, 1);
        //     }
        // }

        // if (!left) {
        //     // System.out.println(cur.val + "kk " + path);
        //     if (cur.left != null) {
        //         dfs(true, cur.left, path + 1);
        //     }
        //     if (cur.right != null) {
        //         dfs(false, cur.right, 1);
        //     }
        // }
    }
}