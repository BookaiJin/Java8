package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-25
 */
public class Main1387 {

    public static void main(String... args) {
        Main1387 main1387 = new Main1387();
        System.out.println(main1387.getKth(12, 15, 2));
    }

    public int getKth(int lo, int hi, int k) {
        if (hi == lo) {
            return lo;
        }
        if (k > (hi - lo + 1)) {
            return -1;
        }
        int[] allSteps = new int[hi - lo + 1];
        int[] allCount = new int[hi - lo + 1];
        int[] toSorted = new int[hi - lo + 1];
        for (int i = 0; i < allSteps.length; i++) {
            allSteps[i] = getSteps(lo + i);
            allCount[i] = lo + i;
        }
        toSorted[0] = 1;
        for (int i = 1; i < allSteps.length; i++) {
            int index = 1;
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    toSorted[j] = index;
                }
                if (allSteps[j] > allSteps[i]) {
                    toSorted[j]++;
                } else if (allSteps[j] <= allSteps[i]) {
                    index++;
                }
            }
        }
        for (int i = 0; i < toSorted.length; i++) {
            if (toSorted[i] == k) {
                return allCount[i];
            }
        }
        return allSteps[0];
    }

    private int getSteps(int n) {
        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                steps++;
                if (n == 1) {
                    break;
                }
            }
            if (n % 2 == 1) {
                n = 3 * n + 1;
                steps++;
            }
        }
        return steps;
    }

}
