package me.bokai.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Bokai
 * @version 10.0
 * Created by Bokai on 2020/9/8
 */
public class Main500 {

    public static void main(String... args) {
        Main500 main500 = new Main500();
        System.out.println(Arrays.toString(main500.findWords(new String[]{"Hello","Alaska","Dad","Peace"})));
    }

    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        String line1 = "qwertyuiop";
        String line2 = "asdfghjkl";
        String line3 = "zxcvbnm";
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;
        boolean next = false;
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                if (line1.indexOf(Character.toLowerCase(word.charAt(j))) != -1) {
                    b1 = false;
                    if (b2 && b3) {
                        continue;
                    } else {
                        next = true;
                        break;
                    }
                }
                if (line2.indexOf(Character.toLowerCase(word.charAt(j))) != -1) {
                    b2 = false;
                    if (b1 && b3) {
                        continue;
                    } else {
                        next = true;
                        break;
                    }
                }
                if (line3.indexOf(Character.toLowerCase(word.charAt(j))) != -1) {
                    b3 = false;
                    if (b2 && b1) {
                        continue;
                    } else {
                        next = true;
                        break;
                    }
                }
            }
            b1 = true;
            b2 = true;
            b3 = true;
            if (next) {
                next = false;
                continue;
            }
            result.add(word);
        }
        return result.toArray(new String[]{});
    }
}
