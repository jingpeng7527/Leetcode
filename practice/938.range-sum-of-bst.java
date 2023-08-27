/*
 * @lc app=leetcode id=938 lang=java
 *
 * [938] Range Sum of BST
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        //recursion
        int res =0;
        if (root == null) {
            return 0;
        }

        int leftSum = rangeSumBST(root.left, low, high);
        int rightSum = rangeSumBST(root.right, low, high);

        res = leftSum + rightSum;

        if (root.val <= high && low<= root.val) {
            res += root.val;
        }

        return res;
        
        // int leftSum = rangeSumBST(root.left, low, high);
        // int rightSum = rangeSumBST(root.right, low, high);

        // res = leftSum + rightSum;

        // if (low <= root.val && root.val <= high) {
        //     res += root.val;
        // }
        
        // return res;
    }
}
// @lc code=end

