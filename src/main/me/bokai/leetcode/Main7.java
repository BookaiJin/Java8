package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-22
 */
public class Main7 {

    public static void main(String... args) {
        Main7 main = new Main7();
        System.out.println(main.reverse(-7120000));
    }

    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return (int)result;
    }
}
