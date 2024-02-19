import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=572 lang=java
 *
 * [572] Subtree of Another Tree
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // 1. we need to check if the two trees are the same
        // 2. if not, we need to check if the left subtree or right subtree is the same

        if (isSameTree(root, subRoot)) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        } 
        else {
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val!=q.val) {
            return false;
        }
        return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
    }
}
// @lc code=end

