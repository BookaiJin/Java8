package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2021/11/8
 */
public class Main299 {

    public String getString(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] indies = new int[10];
        int len = secret.length();
        for (int i = 0; i < len; i++) {
            int sec = secret.charAt(i) - '0';
            int gue = guess.charAt(i) - '0';
            if (sec == gue) {
                bulls++;
                continue;
            }
            if (indies[sec]++ < 0) {
                cows++;
            }
            if (indies[gue]-- > 0) {
                cows++;
            }
        }
        return bulls + "A" + cows + "B";
    }

}
