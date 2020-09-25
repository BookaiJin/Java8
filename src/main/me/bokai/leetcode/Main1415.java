package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-25
 */
public class Main1415 {

    public static void main(String... args){
        Main1415 main1415 = new Main1415();
        System.out.println(main1415.getHappyString(3, 80));
    }

    public String getHappyString(int n, int k) {
        int count = (int) (3 * Math.pow(2, n - 1));
        if(k > count){
            return "";
        }
        String sum = "";

        return sum;
    }


}