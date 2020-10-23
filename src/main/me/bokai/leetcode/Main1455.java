package me.bokai.leetcode;

public class Main1455 {
    public static void main(String[] args) {
        Main1455 main1455 = new Main1455();
        System.out.println(main1455.isPrefixOfWord("i love java", "ja"));
    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
