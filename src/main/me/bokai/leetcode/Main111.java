package me.bokai.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import me.bokai.leetcode.tree.TreeNodeUtils.TreeNode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2021/11/8
 */
public class Main111 {

    public int minDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        Queue<TreeNode> queue1 = new LinkedBlockingQueue<>();
        Queue<TreeNode> queue2 = new LinkedBlockingQueue<>();
        queue1.add(root);
        depth++;
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            if (!queue1.isEmpty()) {
                while (!queue1.isEmpty()) {
                    TreeNode node = queue1.remove();
                    if (node.left == null && node.right == null) {
                        return depth;
                    }
                    if (node.left != null) queue2.add(node.left);
                    if (node.right != null) queue2.add(node.right);
                }
                depth++;
            }
            if (!queue2.isEmpty()) {
                while (!queue2.isEmpty()) {
                    TreeNode node = queue2.remove();
                    if (node.left == null && node.right == null) {
                        return depth;
                    }
                    if (node.left != null) queue1.add(node.left);
                    if (node.right != null) queue1.add(node.right);
                }
                depth++;
            }
        }
        return depth;
    }

    public int min(TreeNode root){

        if (root == null)
            return 0;
        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode temp,magic = new TreeNode(0);
        queue.add(root);
        queue.add(magic);
        while(!queue.isEmpty()){
            temp = queue.poll();
            if(temp.equals(magic)){
                if(!queue.isEmpty()){
                    depth++;
                    queue.add(magic);
                }
                continue;
            }
            if(temp.left == null && temp.right == null)
                return depth;
            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);
        }
        return depth;
    }

}
