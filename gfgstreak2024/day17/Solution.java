package gfgstreak2024.day17;

public class Solution {

    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("aabbccc"));
    }

    private static char nonRepeatingChar(String s) {
        int frequency[] = new int[26];
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1)
                return s.charAt(i);
        }
        return '$';
    }
}
