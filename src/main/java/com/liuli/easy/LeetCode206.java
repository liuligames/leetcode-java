package com.liuli.easy;

import org.springframework.stereotype.Component;

/**
 * @author liu
 * @date 2019/5/8 14:25
 */
@Component
public class LeetCode206 {


    public static ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode result = null;
        while (current != null && current.next != null) {
            result = current.next;
            current.next = current.next.next;
            result.next = head;
            head = result;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5};
        ListNode head = new ListNode(input);
        reverseList(head);
    }
}
