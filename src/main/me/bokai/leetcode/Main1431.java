package me.bokai.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-09
 */
public class Main1431 {

    public static void main(String... args) {
        Main1431 main1431 = new Main1431();
        System.out.println(Arrays.toString(main1431.kidsWithCandies(new int[]{1, 2, 3, 4}, 1).toArray(new Boolean[]{})));
    }


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean[] result = new Boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            for (int j = 0; j < candies.length; j++) {
                if (i == j) {
                    continue;
                }
                if (candies[i] + extraCandies >= candies[j]) {
                    result[i] = true;
                } else {
                    result[i] = false;
                    break;
                }
            }
        }
        return Arrays.asList(result);
    }
}
