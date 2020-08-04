package me.bokai.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-08-02
 */
public class Main102 {

    public static void main(String... args) {
        Main102 main = new Main102();
        Main94.TreeNode node1 = new Main94.TreeNode(1);
        Main94.TreeNode node2 = new Main94.TreeNode(2);
        Main94.TreeNode node3 = new Main94.TreeNode(3);
        Main94.TreeNode node4 = new Main94.TreeNode(4);
        Main94.TreeNode node5 = new Main94.TreeNode(5);
        Main94.TreeNode node6 = new Main94.TreeNode(6);
        Main94.TreeNode node7 = new Main94.TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        List<List<Integer>> list = main.levelOrder(node1);
        for (List<Integer> list1 : list) {
            for (int i : list1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> levelOrder(Main94.TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null){
            return lists;
        }
        Queue<Main94.TreeNode> queue = new LinkedList<>();
        Queue<Main94.TreeNode> queue1 = new LinkedList<>();
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
                lists.add(list);
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
            lists.add(list);
        }
        return lists;
    }
}
