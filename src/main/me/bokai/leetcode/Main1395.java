package me.bokai.leetcode;

/**
 * @author Bokai
 * @version 10.0
 * Created by Bokai on 2020/9/9
 */
public class Main1395 {

    public static void main(String... args) {
        Main1395 main1395 = new Main1395();
        System.out.println(main1395.numTeams(new int[]{1, 2, 3, 4}));
    }

    public int numTeams(int[] rating) {
        int result = 0;
        for (int i = 0; i < rating.length; i++) {
            for (int j = i + 1; j < rating.length; j++) {
                for (int k = j + 1; k < rating.length; k++) {
                    if (rating[i] < rating[j] && rating[j] < rating[k]) {
                        result++;
                    } else if (rating[i] > rating[j] && rating[j] > rating[k]) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
