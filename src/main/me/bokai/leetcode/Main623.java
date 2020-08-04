package me.bokai.leetcode;

/**
 * @author Bokai
 * @version 10.0
 * Created by Bokai on 2020/8/2
 */
public class Main623 {

    public static void main(String... args) {
        Main623 main = new Main623();
//        TreeNode node = new TreeNode(1);
//        main.addOneRow(node, 3, 1);
    }


    public TreeNode addOneRow(TreeNode root, int v, int d) {
        addOneRowDeep(root, v, d-2);
        return root;
    }

    private void addOneRowDeep(TreeNode root, int v, int d){
        if(d == 0){
            TreeNode node1 = new TreeNode(v);
            TreeNode node2 = new TreeNode(v);
            node1.left = root.left;
            node2.right = root.right;
            root.left = node1;
            root.right = node2;
        }
        if(root.left != null) {
            addOneRowDeep(root.left, v, d - 1);
        }
        if(root.right != null) {
            addOneRowDeep(root.right, v, d - 1);
        }
    }


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
