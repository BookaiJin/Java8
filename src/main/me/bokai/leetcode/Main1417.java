package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-27
 */
public class Main1417 {

    public static void main(String... args){
        Main1417 main1417 = new Main1417();
        System.out.println(main1417.reformat("void1111"));
    }


    public String reformat(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                digits.append(c);
            }
            if (Character.isLetter(c)) {
                letters.append(c);
            }
        }
        if (Math.abs(letters.length() - digits.length()) > 1) {
            return "";
        }
        StringBuilder string = new StringBuilder();
        if (letters.length() - digits.length() > 0) {
            for (int i = 0; i < letters.length(); i++) {
                string.append(letters.charAt(i));
                if (i < digits.length()) {
                    string.append(digits.charAt(i));
                }
            }
        } else {
            for (int i = 0; i < digits.length(); i++) {
                string.append(digits.charAt(i));
                if (i < letters.length()) {
                    string.append(letters.charAt(i));
                }
            }
        }
        return string.toString();
    }
}
