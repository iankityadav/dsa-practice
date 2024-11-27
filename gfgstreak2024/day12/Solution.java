package gfgstreak2024.day12;

public class Solution {

    public static void main(String[] args) {
        System.out.println(circularSubarraySum(new int[] { 8, -8, 9, -9, 10, -11, 12 }));
    }

    private static int circularSubarraySum(int arr[]) {
        int t = 0, currMax = 0, currMin = 0, maxSum = arr[0], minSum = arr[0];
        for (int i : arr) {
            currMax = Math.max(currMax + i, i);
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(currMin + i, i);
            minSum = Math.min(minSum, currMin);
            t += i;
        }
        int normalSum = maxSum;
        int circularSum = t - minSum;
        if (minSum == t)
            return normalSum;
        return Math.max(normalSum, circularSum);
    }
}
