package com.liuli.easy;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author liu
 * @date 2019/5/9 19:11
 */
@Component
public class LeetCode20 {

    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        Map<Character,Character> map = new HashMap<>();
//        map.put(')','(');
//        map.put(']','[');
//        map.put('}','{');
//        for (char c : s.toCharArray()){
//            if(!map.containsKey(c)){
//                stack.push(c);
//            }else if (stack.isEmpty() || !map.get(c).equals(stack.pop())){
//                return false;
//            }
//        }
//        return stack.isEmpty();
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "((({}))";
        isValid(s);
    }
}
