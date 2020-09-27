package me.bokai.leetcode;

public class Main1492 {

    public static void main(String[] args) {
        Main1492 main1492 = new Main1492();
        System.out.println(main1492.kthFactor(7, 2));
    }

    public int kthFactor(int n, int k) {
        int count = 0;
        int number = -1;
        int div = 1;

        while(true){
            if(n % div++ == 0){
                number = div-1;
                count++;
            }
            if (count == k) {
                break;
            }
            if(div > n+1){
                return -1;
            }
        }

        return number;
    }


}