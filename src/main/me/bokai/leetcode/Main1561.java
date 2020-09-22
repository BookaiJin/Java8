package me.bokai.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main1561 {

    public static void main(String[] args) {
        Main1561 main1561 = new Main1561();
        System.out.println(main1561.maxCoins(new int[]{2,4,1,2,7,8}));
    }

    public int maxCoins(int[] piles) {
        int group = piles.length;
        int count = group/3;
        int sum = 0;
        Arrays.sort(piles);
        for(int i=piles.length-2,j=0;j<count;j++,i-=2){
            sum += piles[i];
        }
        return sum;
    }
}
