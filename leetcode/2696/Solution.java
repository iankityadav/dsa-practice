import java.util.Stack;

/**
 * Using stack to perform operations and pop out char seqeunce of "AB" and "CD"
 */
public class Solution {
    public static void main(String[] args) {
        int a = minLength("BJKDKABJ");
        System.out.println(a);
    }

    public static int minLength(String s) {
        Stack<Character> st = new Stack<>();
        for (Character a : s.toCharArray()) {
            if (st.size() > 0 && st.peek() == 'A' && a == 'B') {
                st.pop();
            } else if (st.size() > 0 && st.peek() == 'C' && a == 'D') {
                st.pop();
            } else {
                st.push(a);
            }
        }
        return st.size();
    }
}