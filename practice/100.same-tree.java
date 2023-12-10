/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        // 1. when both are null, return true
        // 2. when one of them is null, return false
        // 3. when both are not null, compare the value, if not equal, return false
        // 4. when both are not null, compare the left and right, if not equal, return false
        // 5. when both are not null, compare the left and right, if equal, return true

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

