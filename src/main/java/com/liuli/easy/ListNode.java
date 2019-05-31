package com.liuli.easy;

import lombok.Data;

/**
 * @author liu
 * @date 2019/5/8 15:29
 */
@Data
public class ListNode {

    int value;

    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int[] nums) {
        ListNode target = new ListNode(nums[0]);
        ListNode head = target;
        for (int i = 1; i < nums.length; i++) {
            target.next = new ListNode(nums[i]);
            target = target.next;
        }
        this.value = head.value;
        this.next = head.next;
    }
}
