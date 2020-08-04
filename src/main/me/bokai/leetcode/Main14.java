package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-25
 */
public class Main14 {
    public static void main(String... args) {
        Main14 main = new Main14();
        String[] strings = new String[]{"", "", ""};
        System.out.println(main.longestCommonPrefix(strings));
    }


    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        if (strs[0].isEmpty()) {
            return "";
        }
        boolean interrupt = false;
        char temp = strs[0].charAt(0);
        for (int i=0; ; i++) {
            temp = strs[0].charAt(i);
            for (String s : strs) {
                if (s.indexOf(i) != temp) {
                    interrupt = true;
                }
            }
            if (interrupt) {
                break;
            }
            result.append(temp);
        }
        return result.toString();
    }

}
