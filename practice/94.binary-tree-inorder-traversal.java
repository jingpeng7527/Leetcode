import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resu = new ArrayList<>();
        if (root == null) {
            return resu;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (node!=null||!stack.isEmpty()) {

            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                resu.add(node.val);
                node = node.right;
            }
        }
        
        // preorder(root, resu);
        return resu;
    }

    // public void preorder(TreeNode root, List<Integer> result) {
    //     if (root == null) {
    //         return;
    //     }

    //     preorder(root.left, result);
    //     result.add(root.val);
    //     preorder(root.right, result);

    // }
}
// @lc code=end
