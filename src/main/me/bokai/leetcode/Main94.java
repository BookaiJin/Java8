package me.bokai.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-28
 */
public class Main94 {

    public static void main(String... args) {
        Main94 main = new Main94();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        System.out.println(Arrays.toString(main.inorderTraversal(node1).toArray(new Integer[7])));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return list;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            list.addFirst(root.val);

            if (root.left != null) {
                stack.push(root.left);
            }
            if (root.right != null) {
                stack.push(root.right);
            }
        }

        return list;
    }

    public List<Integer> lastorderTraversal(TreeNode root) {
        //后续递归版本
        List<Integer> list = new ArrayList<>();
        lastorder(root, list);
        return list;
    }

    private void lastorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        lastorder(root.left, list);
        lastorder(root.right, list);
        list.add(root.val);
    }

    //<editor-fold desc="Description">
    //    public List<Integer> preorderTraversal(TreeNode root) {
//        前序迭代版本
//        List<Integer> list = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        if(root == null){
//            return list;
//        }
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            root = stack.pop();
//            list.add(root.val);
//            if (root.right != null) {
//                stack.push(root.right);
//            }
//            if (root.left != null) {
//                stack.push(root.left);
//            }
//        }
//
//        return list;
//    }

//    public List<Integer> preorderTraversal(TreeNode root) {
//
//        List<Integer> list = new ArrayList<>();
//        preorder(root, list);
//        return list;
//    }
//
//    private void preorder(TreeNode root, List<Integer> list) {
//
//        //前序递归版本
//        if (root == null) {
//            return;
//        }
//        list.add(root.val);
//        preorder(root.left, list);
//        preorder(root.right, list);
//    }
    //</editor-fold>


    //<editor-fold desc="Description">
//    private List<Integer> inorderTraversalIterator(TreeNode root) {
//        //中序迭代版本
//        List<Integer> list = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        while (root != null || !stack.isEmpty()) {
//            while (root != null) {
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.pop();
//            list.add(root.val);
//            root = root.right;
//        }
//        return list;
//    }
//
//    public List<Integer> inorderTraversal(TreeNode root) {
//        //中序递归版本
//        List<Integer> list = new ArrayList<>();
//        inorder(root, list);
//        return list;
//    }
//
//    private void inorder(TreeNode root, List<Integer> list) {
//        if (root == null) {
//            return;
//        }
//        inorder(root.left, list);
//        list.add(root.val);
//        inorder(root.right, list);
//    }
    //</editor-fold>

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

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }
}
