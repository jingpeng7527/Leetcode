import java.util.*;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resu = new ArrayList<>();
        if (root == null){
            return resu;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode treenode = stack.pop();
            resu.add(treenode.val);
            if (treenode.right!=null) {
                stack.push(treenode.right);
            }
            if (treenode.left!=null) {
                stack.push(treenode.left);
            }
        }
        // preorder(root, resu);
        return resu;
    }

    // public void preorder(TreeNode root, List<Integer> result) {
    //     if (root == null) {
    //         return;
    //     }
    //     result.add(root.val);
    //     preorder(root.left, result);
    //     preorder(root.right, result);
    // }
}
// @lc code=end

