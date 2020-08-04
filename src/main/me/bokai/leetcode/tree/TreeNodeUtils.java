package me.bokai.leetcode.tree;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-08-02
 */
public class TreeNodeUtils {


    class TreeNode {
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
