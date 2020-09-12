package me.bokai.leetcode;

public class Main771 {
    public static void main(String[] args) {
        Main771 main771 = new Main771();
        System.out.println(main771.numJewelsInStones("aA", "AAAAaaabbb"));
    }

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
