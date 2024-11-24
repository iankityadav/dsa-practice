package gfgstreak2024.day10;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxSubarraySum(new int[] { 2, 3, -8, 7, -1, 2, 3 }));
    }

    private static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for (int e : arr) {
            currSum += e;
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
