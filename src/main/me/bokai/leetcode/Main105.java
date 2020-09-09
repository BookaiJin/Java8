package me.bokai.leetcode;

import java.util.Arrays;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-08-26
 */
public class Main105 {

    public static void main(String... args) {
        Main105 main = new Main105();
        main.buildTree(new int[]{1, 2, 4, 5, 3, 6, 7}, new int[]{4, 2, 5, 1, 6, 3, 7});
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        if (preorder.length == 1) {
            return root;
        }
        String inorderStr = Arrays.toString(inorder);
        buildTree(root, Arrays.copyOfRange(preorder, 1, preorder.length - 1), inorderStr);
        return root;
    }

    private void buildTree(TreeNode root, int[] preorder, String inorder) {
        if (preorder.length == 1) {
            return;
        }
        int temp = preorder[0];
        if (inorder.indexOf(temp) < inorder.indexOf(root.val)) {
            root.left = new TreeNode(temp);
            buildTree(root.left, Arrays.copyOfRange(preorder, 1, preorder.length - 1), inorder);
        } else {
            root.right = new TreeNode(temp);
            buildTree(root.right, Arrays.copyOfRange(preorder, 1, preorder.length - 1), inorder);
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
