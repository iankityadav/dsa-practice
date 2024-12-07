package gfgstreak2024.day22;

public class Solution {

    public static void main(String[] args) {
        System.out.println(hIndex(new int[] { 3, 0, 5, 3, 0 }));
    }

    static int hIndex(int[] citations) {
        int n = citations.length;
        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (citations[i] >= n)
                freq[n] += 1;
            else
                freq[citations[i]] += 1;
        }

        int idx = n;
        int s = freq[n];
        while (s < idx) {
            idx--;
            s += freq[idx];
        }

        return idx;
    }
}
