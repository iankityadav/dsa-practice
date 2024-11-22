package gfgstreak2024.day8;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maximumProfit(new int[] { 7, 10, 1, 3, 6, 9, 2 }));
    }

    public static int maximumProfit(int prices[]) {
        int min = prices[0], p = 0;
        for (int s : prices) {
            min = Math.min(min, s);
            p = Math.max(p, s - min);
        }
        return p;
    }
}
