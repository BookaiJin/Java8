package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-22
 */
public class Main8 {
    public static void main(String... args) {
        Main8 main = new Main8();
        main.myAtoi("");
    }

    public int myAtoi(String str) {
        long result = 0;
        boolean minus = false;
        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c) && !Character.isDigit(c) && c != '-' && c != '+') {
                break;
            }
            if (c == '-') {
                minus = true;
            }
            if (Character.isDigit(c)) {
                result = result * 10 + (c - '0');
            }
        }
        result = minus ? 0 - result : result;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }
}