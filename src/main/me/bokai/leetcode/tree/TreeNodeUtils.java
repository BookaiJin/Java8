package me.bokai.leetcode.tree;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-08-02
 */
public class TreeNodeUtils {


    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
