package leetcode.medium_1963;

import java.util.Stack;

/**
 * Using stack to perform operations and push opening and pop out closing
 * brackets
 */
public class Solution {
    public static void main(String[] args) {
        int a = minSwaps("]]][[[");
        System.out.println(a);
    }

    public static int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        for (Character a : s.toCharArray()) {
            if (a == '[') {
                st.push(a);
            }
            if (st.size() > 0 && st.peek() == '[' && a == ']') {
                st.pop();
            }
        }
        int res = st.size();
        return res % 2 == 0 ? res / 2 : (res + 1) / 2;
    }
}