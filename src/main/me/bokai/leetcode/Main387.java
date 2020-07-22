package me.bokai.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-22
 */
public class Main387 {

    public static void main(String... args) {
        Main387 main = new Main387();
        System.out.println(main.firstUniqChar("dddccdbba"));
    }

    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        for (char c : s.toCharArray()) {
            chars[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            if (chars[c - 'a'] == 1) {
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
