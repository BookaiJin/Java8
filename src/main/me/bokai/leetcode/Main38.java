package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-25
 */
public class Main38 {

    public static void main(String... args) {
        Main38 main = new Main38();
        System.out.println(main.countAndSay(6));
    }

    public String countAndSay(int n) {
        String result = "1";
        if (n == 1) {
            return result;
        }
        for (int i = 2; i <= n; i++) {
            char cTemp = 'a';
            int count = 0;
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < result.length(); j++) {
                if (cTemp != result.charAt(j)) {
                    if (j != 0) {
                        temp.append(count).append(cTemp);
                    }
                    cTemp = result.charAt(j);
                    count = 1;
                } else {
                    count++;
                }
            }
            temp.append(count).append(cTemp);
            result = temp.toString();
        }
        return result;
    }
}
