package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-22
 */
public class Main125 {
    public static void main(String... args) {
        Main125 main = new Main125();
        System.out.println(main.isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end) {
            while (start < s.length() && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (end >= 0 && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (start < s.length() && end >= 0) {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    return false;
                }
            }
            start++;
            end--;
        }
        return true;
    }
}
