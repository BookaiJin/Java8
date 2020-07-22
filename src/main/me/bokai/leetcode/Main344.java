package me.bokai.leetcode;

import java.util.Arrays;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-22
 */
public class Main344 {

    public static void main(String... args) {
        Main344 main344 = new Main344();
        char[] test = "Hello".toCharArray();
        main344.reverseString(test);
        System.out.println(Arrays.toString(test));
    }

    private void reverseString(char[] s) {
        char temp;
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

}
