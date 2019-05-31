package com.liuli.easy;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liu
 * @date 2019/5/8 10:55
 */

@Component
public class LeetCode771 {

    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        if (J == null || "".equals(J) || S == null || "".equals(S)) {
            return count;
        }

        Set set = new HashSet();
        for (char i : J.toCharArray()) {
            set.add(i);
        }
        for (char j : S.toCharArray()) {
            if (set.contains(j)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String J = "zZadswqe";
        String S = "qweQQSddZz";
        numJewelsInStones(J, S);
    }
}
