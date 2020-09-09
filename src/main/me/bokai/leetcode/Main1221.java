package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-09
 */
public class Main1221 {

    public static void main(String... args) {
        Main1221 main1221 = new Main1221();
        System.out.println(main1221.balancedStringSplit("LLRRRRLRLRLRL"));
    }

    public int balancedStringSplit(String s) {
        int count = 0;
        int index = 0;
        int countL = 0;
        int countR = 0;
        while (true) {
            for (int i = index; i < s.length(); i++) {
                if (s.charAt(i) == 'L') {
                    countL++;
                }
                if (s.charAt(i) == 'R') {
                    countR++;
                }
                if (countL == countR && countL != 0) {
                    count++;
                    index += countL + countR;
                    countL = 0;
                    countR = 0;
                    break;
                }
            }
            if (index >= s.length()) {
                break;
            } else if (countL != 0 || countR != 0) {
                index++;
                countL = 0;
                countR = 0;
            }
        }
        return count;
    }
}
