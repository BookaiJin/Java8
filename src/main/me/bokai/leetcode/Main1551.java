package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-09
 */
public class Main1551 {

    public static void main(String... args) {
        Main1551 main1551 = new Main1551();
        System.out.println(main1551.minOperations(100));
    }

    public int minOperations(int n) {
        int count = n / 2;
        if (n % 2 == 1) {
            return count * count + count;
        } else {
            return count * count;
        }
    }

}
