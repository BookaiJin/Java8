package me.bokai.leetcode;

public class Main1486 {

    public static void main(String[] args) {
        Main1486 main1486 = new Main1486();
        System.out.println(main1486.xorOperation(3, 4));
    }

    public int xorOperation(int n, int start) {
        int result = 0;
        while(n>0){
            result ^= start;
            start += 2;
            n--;
        }
        return result;
    }
}
