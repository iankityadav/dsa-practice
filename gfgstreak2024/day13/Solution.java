package gfgstreak2024.day13;

public class Solution {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] { 2, -3, 4, 1, 1, 7 }));
    }

    private static int missingNumber(int[] arr) {
        int n = arr.length;
        boolean vst[] = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                vst[arr[i] - 1] = true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (!vst[i]) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
