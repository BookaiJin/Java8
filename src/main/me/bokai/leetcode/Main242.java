package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-22
 */
public class Main242 {

    public static void main(String... args) {
        Main242 main = new Main242();
        System.out.println(main.isAnagram("a", "b"));
    }

    public boolean isAnagram(String s, String t) {
        int[] seq = new int[100];
        for (int i = 0; i < s.length(); i++) {
            seq[s.charAt(i) - '0']++;
        }
        for (int i = 0; i < t.length(); i++) {
            seq[t.charAt(i) - '0']--;
        }
        for (int i : seq) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
