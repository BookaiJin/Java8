package me.bokai.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-22
 */
public class Main872 {

    List<Integer> rootVal1 = new ArrayList<>();
    List<Integer> rootVal2 = new ArrayList<>();

    public static void main(String... args){
        Main872 main872 = new Main872();
        TreeNode root1 = new TreeNode(3);
        TreeNode root2 = new TreeNode(3);
        main872.leafSimilar(root1, root2);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        getLeaf(root1, rootVal1);
        getLeaf(root2, rootVal2);
        if (rootVal1.size() != rootVal2.size()) {
            return false;
        }
        for (int i = 0; i < rootVal1.size(); i++) {
            if (rootVal1.get(i).equals(rootVal2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private void getLeaf(TreeNode root, List<Integer> list) {
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        if (root.left != null) {
            getLeaf(root.left, list);
        }
        if (root.right != null) {
            getLeaf(root.right, list);
        }
    }

    public static class TreeNode {
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
