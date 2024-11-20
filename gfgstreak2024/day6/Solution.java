package gfgstreak2024.day6;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findMajority(new int[] { 1, 2, 5, 5, 5, 5, 6, 6, 6, 6, 6 }));
    }

    public static List<Integer> findMajority(int[] nums) {
        int n = nums.length;
        int c1 = -1, c2 = -1, cnt1 = 0, cnt2 = 0;
        for (int i : nums) {
            if (c1 == i) {
                cnt1++;
            } else if (c2 == i) {
                cnt2++;
            } else if (cnt1 == 0) {
                c1 = i;
                cnt1++;
            } else if (cnt2 == 0) {
                c2 = i;
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for (int i : nums) {
            if (c1 == i)
                cnt1++;
            if (c2 == i)
                cnt2++;
        }
        if (cnt1 > n / 3)
            res.add(c1);
        if (cnt2 > n / 3 && c1 != c2)
            res.add(c2);

        if (res.size() == 2 && c1 > c2) {
            res = new ArrayList<>();
            res.add(c2);
            res.add(c1);
        }
        return res;
    }
}
