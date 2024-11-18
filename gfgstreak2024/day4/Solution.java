package gfgstreak2024.day4;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        rotateArr(arr, 11);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        int r = d % n;
        int arrd[] = new int[r];
        for (int i = 0; i < r; i++) {
            arrd[i] = arr[i];
        }
        for (int i = 0; i < n - r; i++) {
            arr[i] = arr[r + i];
        }
        for (int i = n - r; i < n; i++) {
            arr[i] = arrd[i - (n - r)];
        }
    }
}
