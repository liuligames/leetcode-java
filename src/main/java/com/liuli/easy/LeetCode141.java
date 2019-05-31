package com.liuli.easy;

import org.springframework.stereotype.Component;

/**
 * @author liu
 * @date 2019/5/8 16:51
 */
@Component
public class LeetCode141 {

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5};
        ListNode head = new ListNode(input);
        hasCycle(head);
    }
}
