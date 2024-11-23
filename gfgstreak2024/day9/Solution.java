package gfgstreak2024.day9;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMinDiff(new int[] { 3, 9, 12, 16, 20 }, 3));
    }

    public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int smallest = arr[0] + k, largest = arr[n - 1] - k;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - k < 0)
                continue;
            int mini = Math.min(smallest, arr[i + 1] - k);
            int maxi = Math.max(largest, arr[i] + k);
            ans = Math.min(ans, maxi - mini);
        }
        return ans;
    }
}