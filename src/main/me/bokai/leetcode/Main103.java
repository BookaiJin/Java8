package me.bokai.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-08-25
 */
public class Main103 {

    public static void main(String... args) {
        Main103 main = new Main103();
        main.zigzagLevelOrder(new TreeNode(3));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        addRoot(root, result);
        return result;
    }

    private void addRoot(TreeNode root, List<List<Integer>> result) {
        Queue<TreeNode> leftQueue = new LinkedList<>();
        Queue<TreeNode> rightQueue = new LinkedList<>();
        leftQueue.add(root);
        TreeNode temp;
        while (!leftQueue.isEmpty() || !rightQueue.isEmpty()) {
            LinkedList<Integer> list = new LinkedList<>();
            if (!leftQueue.isEmpty()) {
                while (!leftQueue.isEmpty()) {
                    temp = leftQueue.poll();
                    list.add(temp.val);
                    if (temp.left != null) rightQueue.add(temp.left);
                    if (temp.right != null) rightQueue.add(temp.right);
                }
                result.add(list);
                continue;
            }
            while (!rightQueue.isEmpty()) {
                temp = rightQueue.poll();
                list.addFirst(temp.val);
                if (temp.left != null) leftQueue.add(temp.left);
                if (temp.right != null) leftQueue.add(temp.right);
            }
            result.add(list);
        }
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
}
