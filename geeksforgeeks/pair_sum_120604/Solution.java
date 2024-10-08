package geeksforgeeks.pair_sum_120604;

/**
 * To find largest pair sum, need to find largest and second largest numer
 */
public class Solution {
    public static void main(String[] args) {
        int a = pairsum(new int[] { 12, 34, 10, 6, 40 });
        System.out.println(a);
    }

    public static int pairsum(int[] arr) {
        int n1 = 0, n2 = -1;
        for (int i : arr) {
            if (i > n1) {
                n2 = n1;
                n1 = i;
            }
            if (n2 < i && i < n1) {
                n2 = i;
            }
        }
        return n1 + n2;
    }
}
