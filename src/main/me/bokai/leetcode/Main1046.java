package me.bokai.leetcode;

public class Main1046 {

    public static void main(String[] args) {
        Main1046 main1046 = new Main1046();
        System.out.println(main1046.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }

    public int lastStoneWeight(int[] stones) {
        int i = 0,j = 0;
        int max= 0,max1=0;
        int count = stones.length;
        while(count != 1){
            for(int k=0;k<stones.length;k++){
                if(stones[k]>=max){
                    j = i;
                    max1 = max;
                    i = k;
                    max = stones[k];
                    continue;
                }
                if(stones[k]>=max1){
                    j = k;
                    max1 = stones[k];
                }
            }
            if(max == max1){
                count-=2;
                stones[i] = 0;
                stones[j] = 0;
                max = 0;
                max1 = 0;
            }
            if(max > max1){
                count-=1;
                stones[i] = 0;
                stones[j] = max - max1;
                max = 0;
                max1 = 0;
            }
        }
        int result = 0;
        for(int n:stones){
            if(n != 0){
                result = n;
                break;
            }
        }
        return result;
    }
}
