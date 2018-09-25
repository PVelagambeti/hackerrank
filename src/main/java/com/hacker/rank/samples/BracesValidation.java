package com.hacker.rank.samples;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Braces matching
 */
public class BracesValidation {

    public static void main(String[] args) {
        String str = "{{{[]}}}";
        System.out.println(parenthesis(str));
    }

    public static boolean parenthesis(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mp = new HashMap<Character, Character>() {

            {
                put('(', ')');
                put('[', ']');
                put('{', '}');
            }
        };

        for (char ch : s.toCharArray()) {
            if (mp.containsKey(ch)) {
                stack.push(ch);
            } else if (mp.containsValue(ch)) {
                if (stack.isEmpty() || mp.get(stack.pop()) != ch) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
