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
        TreeNode node1l = new TreeNode(5);
        TreeNode node1r = new TreeNode(1);
        TreeNode node21l = new TreeNode(6);
        TreeNode node21r = new TreeNode(2);
        TreeNode node22l = new TreeNode(9);
        TreeNode node22r = new TreeNode(8);
        TreeNode node31l = new TreeNode(7);
        TreeNode node31r = new TreeNode(4);
        root1.left = node1l;
        root1.right = node1r;
        node1l.left = node21l;
        node1l.right = node21r;
        node1r.left = node22l;
        node1r.right = node22r;
        node21r.left = node31l;
        node21r.right = node31r;

        TreeNode node2l = new TreeNode(5);
        TreeNode node2r = new TreeNode(1);
        TreeNode node231l = new TreeNode(6);
        TreeNode node231r = new TreeNode(7);
        TreeNode node232l = new TreeNode(4);
        TreeNode node232r = new TreeNode(2);
        TreeNode node241l = new TreeNode(9);
        TreeNode node241r = new TreeNode(8);
        root2.left = node2l;
        root2.right = node2r;
        node2l.left = node231l;
        node2l.right = node231r;
        node2r.left = node232l;
        node2r.right = node232r;
        node232r.left = node241l;
        node232r.right = node241r;
        main872.leafSimilar(root1, root2);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        getLeaf(root1, rootVal1);
        getLeaf(root2, rootVal2);
        if (rootVal1.size() != rootVal2.size()) {
            return false;
        }
        for (int i = 0; i < rootVal1.size(); i++) {
            if (!rootVal1.get(i).equals(rootVal2.get(i))) {
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
