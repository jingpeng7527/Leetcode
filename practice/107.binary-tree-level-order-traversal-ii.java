import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
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
    public List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // dfs(root, 0);
        bfs(root);
//         List<List<Integer>> list1 = new ArrayList<>();
//         for (int i = list.size()-1; i >=0; i--) {
//             list1.add(list.get(i));
// }
// return list1;
        return list;
    }

    // public void dfs(TreeNode treenode, int tier) {
    //     if (treenode == null) {
    //         return;
    //     }
    //     tier++;

    //     if (list.size() < tier) {
    //         List<Integer> lier = new ArrayList<>();
    //         list.add(lier);
    //     }
    //     list.get(tier - 1).add(treenode.val);
    //     dfs(treenode.left, tier);
    //     dfs(treenode.right, tier);
    // }
    
    public void bfs (TreeNode treeNode) {
        if (treeNode == null) return;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(treeNode);

        while (!que.isEmpty()) {
            List<Integer> lier = new ArrayList<>();
            int len = que.size();
            while (len > 0) {
                TreeNode node = que.poll();
                lier.add(node.val);
                if (node.left != null)
                    que.offer(node.left);
                if (node.right != null)
                    que.offer(node.right);
                len--;
            }
            list.add(0, lier);
        }
    }
}
// @lc code=end

