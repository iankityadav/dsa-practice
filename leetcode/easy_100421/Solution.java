package leetcode.easy_100421;

import java.util.*;

/**
 * Solution
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(stringSequence("ha"));
    }

    public static List<String> stringSequence(String target) {
        List<String> ls = new ArrayList<>();
        String curr = "";
        for (int i = 0; i < target.length(); i++) {
            curr += "a";
            ls.add(curr);
            while (curr.charAt(i) != target.charAt(i)) {
                curr = curr.substring(0, i) + (char) (curr.charAt(i) + 1) + curr.substring(i + 1);
                ls.add(curr);
            }
        }
        return ls;
    }
}