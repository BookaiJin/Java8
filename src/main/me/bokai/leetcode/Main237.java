package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-22
 */
public class Main237 {

    public static void main(String... args) {
        Main237 main237 = new Main237();
        main237.deleteNode(new ListNode(2));
    }

    public void deleteNode(ListNode node) {
        while(node.next != null){
            node.val = node.next.val;
            if(node.next.next == null){
                node.next = null;
                break;
            }
            node = node.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
