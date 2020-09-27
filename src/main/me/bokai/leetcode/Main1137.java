package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-27
 */
public class Main1137 {

    public static void main(String... args){
        Main1137 main1137 = new Main1137();
        System.out.println(1389537);
        System.out.println(main1137.tribonacci(25));
    }


    public int tribonacci(int n) {
        if(n < 2){
            return n;
        }
        int a = 0, b = 1, c = 1;
        int d = 0;
        while (n-- > 2) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}
