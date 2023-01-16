import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=637 lang=java
 *
 * [637] Average of Levels in Binary Tree
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        List<Integer> counts= new ArrayList<>();
        List<Double> sum = new ArrayList<>();
        dfs(root, 0, counts, sum);

        for (int i = 0; i < counts.size(); i++) {
            list.add(sum.get(i)/counts.get(i));
        }
        
        // Deque<TreeNode> que = new LinkedList<>();

        // if (root == null) {
        //     return list;
        // }

        // que.add(root);

        // while (!que.isEmpty()) {
        //     int len = que.size();
        //     double sum = 0.0;
        //     for (int i = 0; i < len; i++) {
        //         TreeNode node = que.poll();
        //         sum += node.val;
        //         if (node.left != null) {
        //             que.add(node.left);
        //         }
        //         if (node.right != null) {
        //             que.add(node.right);
        //         }
        //     }
        //     list.add(sum / len);

        // }
        return list;

    }

    public void dfs(TreeNode treeNode, int tier, List<Integer> counts, List<Double> sums) {
        if (treeNode == null) {
            return;
        }

        if (tier < sums.size()) {
            sums.set(tier, sums.get(tier) + treeNode.val);
            counts.set(tier, counts.get(tier) + 1);
        } else {
            sums.add(1.0 * treeNode.val);
            counts.add(1);
        }

        tier++;

        dfs(treeNode.left, tier, counts, sums);
        dfs(treeNode.right, tier, counts, sums);
    }
}
// @lc code=end

