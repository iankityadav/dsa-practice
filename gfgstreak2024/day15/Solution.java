package gfgstreak2024.day15;

public class Solution {

    public static void main(String[] args) {
        System.out.println(addBinary("110", "011"));
    }

    static String trimLeadingZeros(String s) {
        int f1 = s.indexOf('1');
        return (f1 == -1) ? "0" : s.substring(f1);
    }

    static String addBinary(String s1, String s2) {
        s1 = trimLeadingZeros(s1);
        s2 = trimLeadingZeros(s2);

        int n = s1.length();
        int m = s2.length();

        if (n < m) {
            return addBinary(s2, s1);
        }

        int j = m - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            int bit1 = s1.charAt(i) - '0';
            int sum = bit1 + carry;
            if (j >= 0) {
                int bit2 = s2.charAt(j) - '0';
                sum += bit2;
                j--;
            }
            int bit = sum % 2;
            carry = sum / 2;
            ans.append((char) (bit + '0'));
        }

        if (carry > 0)
            ans.append('1');

        return ans.reverse().toString();
    }
}
