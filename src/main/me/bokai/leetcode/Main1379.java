package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-23
 */
public class Main1379 {

    private TreeNode flag = null;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        getTarget(cloned, target);
        return flag;
    }

    private void getTarget(TreeNode cloned, TreeNode target) {
        if (cloned.val == target.val) {
            flag = cloned;
        }
        if (cloned.left != null) {
            getTarget(cloned.left, target);
        }
        if (cloned.right != null) {
            getTarget(cloned.right, target);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
