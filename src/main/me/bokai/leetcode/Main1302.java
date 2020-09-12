package me.bokai.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main1302 {
    public static void main(String[] args) {
        Main1302 main1302 = new Main1302();
        main1302.deepestLeavesSum(new TreeNode(3));
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queue1 = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty() || !queue1.isEmpty()) {
            sum = 0;
            if (!queue.isEmpty()) {
                while (!queue.isEmpty()) {
                    root = queue.poll();
                    sum += root.val;
                    if (root.left != null) {
                        queue1.add(root.left);
                    }
                    if (root.right != null) {
                        queue1.add(root.right);
                    }
                }
                continue;
            }
            while (!queue1.isEmpty()) {
                root = queue1.poll();
                sum += root.val;
                if (root.left != null) {
                    queue.add(root.left);
                }
                if (root.right != null) {
                    queue.add(root.right);
                }
            }
        }
        return sum;
    }

}
