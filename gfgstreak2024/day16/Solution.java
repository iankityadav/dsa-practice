package gfgstreak2024.day16;

public class Solution {

    public static void main(String[] args) {
        System.out.println(areAnagrams("geeks", "kseeg"));
    }

    private static boolean areAnagrams(String s1, String s2) {
        int f[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            f[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            f[s2.charAt(i) - 'a']--;
        }
        for (int c : f) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}
