package me.bokai.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import me.bokai.leetcode.tree.TreeNodeUtils.TreeNode;

/**
 * @author bokai
 * @version 11.0
 * Created by bokai on 2022/6/10
 */
public class Main2196 {
    public static void main(String... args) {
        Solution solution = new Solution();
        int[][] a = new int[][]{{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        solution.createBinaryTree(a);
    }

}

class Solution {

    Map<Integer, TreeNode> intNodeMap = new HashMap<>();
    Set<Integer> parentSet = new HashSet<>();
    Set<Integer> childSet = new HashSet<>();

    public TreeNode createBinaryTree(int[][] descriptions) {
        Arrays.stream(descriptions).forEach(
                array -> {
                    TreeNode parent = intNodeMap.getOrDefault(array[0], new TreeNode(array[0]));
                    TreeNode child = intNodeMap.getOrDefault(array[1], new TreeNode(array[1]));
                    if(array[2] == 0){
                        parent.right = child;
                    } else if (array[2] == 1) {
                        parent.left = child;
                    }
                    parentSet.add(parent.val);
                    childSet.add(child.val);
                    intNodeMap.put(parent.val, parent);
                    intNodeMap.put(child.val, child);
                }
        );
        childSet.forEach(val -> parentSet.remove(val));
        return intNodeMap.get(parentSet.stream().findFirst().get());
    }

}
