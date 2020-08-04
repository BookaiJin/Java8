package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-22
 */
public class Main8 {
    public static void main(String... args) {
        Main8 main = new Main8();
        System.out.println(main.myAtoi("9223372036854775808"));
    }

    public int myAtoi(String str) {
        int result = 0;
        boolean minus = false;
        boolean digital = false;
        String[] toDo = str.split(" ");
        for (String s : toDo) {
            if (s.equalsIgnoreCase("")) {
                continue;
            }
            if (!Character.isDigit(s.charAt(0)) && s.charAt(0) != '+' && s.charAt(0) != '-') {
                return 0;
            }
            for (char c : s.toCharArray()) {
                //已经遍历过数字
                if (digital && !Character.isDigit(c)) {
                    break;
                }
                if (c == '-') {
                    digital = true;
                    minus = true;
                }
                if (c == '+') {
                    digital = true;
                }
                if (Character.isDigit(c)) {
                    if (minus) {
                        if ((0-result) < Integer.MIN_VALUE / 10 || (0-result == Integer.MIN_VALUE / 10 && (c - '0') < -8)) {
                            return Integer.MIN_VALUE;
                        }
                    } else {
                        if ((result) > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && (c - '0') > 7)) {
                            return Integer.MAX_VALUE;
                        }
                    }
                    result = result * 10 + (c - '0');
                    digital = true;
                }
            }
            result = minus ? 0 - result : result;
            return result;
        }
        return 0;
    }
}