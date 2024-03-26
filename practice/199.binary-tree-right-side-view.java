import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
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
    List<Integer> res = new LinkedList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);

        // Queue<TreeNode> queue = new LinkedList<>();
        // List<Integer> res = new LinkedList<>();

        // int n = 0;
        // if (root == null) {
        // return res;
        // } else {
        // n = 1;
        // queue.offer(root);
        // }

        // while (!queue.isEmpty()) {
        // int len = n;
        // n = 0;
        // for (int i = 0; i < len; i++) {
        // TreeNode cur = queue.poll();
        // if (cur.left != null) {
        // queue.offer(cur.left);
        // n++;
        // }
        // if (cur.right != null) {
        // queue.offer(cur.right);
        // n++;
        // }
        // if (i == len - 1) {
        // res.add(cur.val);
        // }
        // }
        // }
        return res;
    }

    public void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        if (depth == res.size())
            res.add(root.val);

        dfs(root.right, depth + 1);
        dfs(root.left, depth + 1);
    }
    // public List<Integer> rightSideView(TreeNode root) {
    //     List<Integer> list = new ArrayList<>();
    //     Queue<TreeNode> que = new LinkedList<>();
    //     if (root != null) {
    //         que.add(root);
    //     }

    //     while (!que.isEmpty()) {
    //         int len = que.size();

    //         while (len > 0) {
    //             TreeNode node = que.poll();
    //             if (node.left != null) {
    //                 que.add(node.left);
    //             }
    //             if (node.right != null) {
    //                 que.add(node.right);
    //             }
    //             if (len == 1) {
    //                 list.add(node.val);
    //             }
    //             len--;
    //         }

    //     }
    //     return list;
    // }
}
// @lc code=end
