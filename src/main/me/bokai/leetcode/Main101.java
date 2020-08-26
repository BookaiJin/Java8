package me.bokai.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-08-25
 */
public class Main101 {

    public static void main(String... args) {
        Main101 main = new Main101();
        main.isSymmetric(new TreeNode(1));
    }

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode root1 = queue.poll();
            TreeNode root2 = queue.poll();
            if(root1 == null && root2 == null){
                continue;
            }
            if(root1 == null || root2 == null){
                return false;
            }
            if (root1.val != root2.val) {
                return false;
            }
            queue.add(root1.left);
            queue.add(root2.right);
            queue.add(root2.left);
            queue.add(root1.right);
        }
        return true;
    }
//        if (root == null) {
//            return true;
//        }
//        return isSymmetricRoot(root.left, root.right);
//    }
//
//    private boolean isSymmetricRoot(TreeNode root1, TreeNode root2) {
//        if (root1 == null && root2 == null) {
//            return true;
//        }
//        if (root1 == null || root2 == null) {
//            return false;
//        }
//        return (root1.val == root2.val)
//                && isSymmetricRoot(root1.left, root2.right)
//                && isSymmetricRoot(root1.right, root2.left);
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
