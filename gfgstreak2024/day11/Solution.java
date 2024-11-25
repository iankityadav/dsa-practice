package gfgstreak2024.day11;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] { -2, 6, -3, -10, 0, 2 }));
    }

    private static int maxProduct(int[] arr) {
        int currMax = arr[0], res = arr[0], currMin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = Math.max(arr[i], Math.max(currMax * arr[i], currMin * arr[i]));
            currMin = Math.min(arr[i], Math.min(currMax * arr[i], currMin * arr[i]));
            currMax = temp;
            res = Math.max(res, currMax);
        }
        return res;
    }
}
