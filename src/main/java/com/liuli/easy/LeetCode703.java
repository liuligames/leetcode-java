package com.liuli.easy;

import java.util.PriorityQueue;

/**
 * @author liu
 * @date 2019/5/13 18:41
 */
public class LeetCode703 {

    final PriorityQueue<Integer> queue;

    final int k;

    public LeetCode703(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for (int n : nums) {
            add(n);
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.offer(val);
        } else if (queue.peek() < val) {
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int[] nums = {1,5,8,7,9,11};
        LeetCode703 a = new LeetCode703(2,nums);
    }
}
