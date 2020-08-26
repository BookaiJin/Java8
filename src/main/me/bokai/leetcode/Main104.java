package me.bokai.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-08-26
 */
public class Main104 {

    public static void main(String... args) {
        Main104 main = new Main104();
        main.maxDepth(new TreeNode(1));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queue1 = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty() || !queue1.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            if (!queue.isEmpty()) {
                while (!queue.isEmpty()) {
                    root = queue.poll();
                    list.add(root.val);
                    if (root.left != null) {
                        queue1.add(root.left);
                    }
                    if (root.right != null) {
                        queue1.add(root.right);
                    }
                }
                result++;
                continue;
            }
            while (!queue1.isEmpty()) {
                root = queue1.poll();
                list.add(root.val);
                if (root.left != null) {
                    queue.add(root.left);
                }
                if (root.right != null) {
                    queue.add(root.right);
                }
            }
            result++;
        }
        return result;
    }
    //
//        return maxDepthNode(root);
//    }
//
//    private int maxDepthNode(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        return Math.max(maxDepthNode(root.left), maxDepthNode(root.right)) + 1;
//    }

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
}
