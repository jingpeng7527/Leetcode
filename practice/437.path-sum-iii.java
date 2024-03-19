/*
 * @lc app=leetcode id=437 lang=java
 *
 * [437] Path Sum III
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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;
        dfs(root, targetSum - root.val);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return res;
    }

    public void dfs(TreeNode node, long targetSum) {
        if (targetSum == 0) {
            res++;
        }

        if (node.left != null) {
            dfs(node.left, targetSum - node.left.val);
        }
        if (node.right != null) {
            dfs(node.right, targetSum - node.right.val);
        }
    }
}
// @lc code=end

