package me.bokai.leetcode;

/**
 * @author Bokai
 * @version 10.0
 * Created by Bokai on 2020/9/9
 */
public class Main876 {
    public static void main(String... args) {

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }
        ListNode firstNode = head;
        ListNode doubleNode = head;
        while(true){
            firstNode = firstNode.next;
            doubleNode = doubleNode.next;
            if(doubleNode.next == null){
                break;
            }
            doubleNode = doubleNode.next;
            if (doubleNode.next == null) {
                break;
            }
        }
        return firstNode;
    }
}
