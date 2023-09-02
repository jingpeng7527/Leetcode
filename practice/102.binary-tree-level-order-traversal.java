import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
    public List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
            // checkFun01(root,0);
            checkFun02(root);
            return result;
        }

        // public void checkFun01(TreeNode node, Integer deep) {
        //     if (node == null) {
        //         return;
        //     }
        //     deep++;
        //     if (result.size() < deep) {
        //         result.add(new ArrayList<Integer>());
        //     }
        //     result.get(deep - 1).add(node.val);
        //     checkFun01(node.left, deep);
        //     checkFun01(node.right, deep);
        // }
    
        public void checkFun02(TreeNode node) {
            if (node == null) {
                return;
            }
            Deque<TreeNode> dq = new ArrayDeque<>();
            dq.add(node);

            while (!dq.isEmpty()) {
                int sz = dq.size();
                // System.out.println(sz);
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < sz; i++) {
                    TreeNode cur = dq.poll();
                    list.add(cur.val);
                    if (cur.left != null) {
                        dq.add(cur.left);
                    }
                    if (cur.right != null) {
                        dq.add(cur.right);
                    }
                }

                result.add(list);

            }

        }
        
    // public void checkFun02(TreeNode node) {
    //     if (node == null) {
    //         return;
    //     }
    //     Queue<TreeNode> que = new LinkedList<TreeNode>();
    //     que.offer(node);

    //     while (!que.isEmpty()) {
            
    //         List<Integer> list = new ArrayList<Integer>();
    //         int len = que.size();
    //         while (len > 0) {
    //             node = que.poll();
    //             list.add(node.val);
    //             if (node.left != null) {
    //                 que.offer(node.left);
    //             }
    //             if (node.right != null) {
    //                 que.offer(node.right);
    //             }
    //             len--;
    //         }
    //         result.add(list);
    //     }
    // }
}
// @lc code=end