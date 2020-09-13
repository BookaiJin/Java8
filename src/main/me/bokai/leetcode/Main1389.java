package me.bokai.leetcode;

import java.util.Arrays;

public class Main1389 {

    public static void main(String[] args) {
        Main1389 main1389 = new Main1389();
        main1389.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1});
    }

    public int[] createTargetArray(int[] nums, int[] index){
        int[] target = new int[index.length];
        Arrays.fill(target, -1);
        for (int i = 0; i < target.length; i++) {
            if (target[index[i]] == -1) {
                target[index[i]] = nums[i];
            } else {
                int[] temp = new int[target.length];
                System.arraycopy(target, 0, temp, 0, target.length);
                target[index[i]] = nums[i];
                System.arraycopy(temp, index[i], target, index[i] + 1, target.length - 1 - index[i]);
            }
        }
        return target;
//        int[] target = new int[nums.length];
//        for(int i=1;i<index.length;i++){
//            for(int j=0;j<i;j++){
//                if(index[i] <= index[j]){
//                    index[j]++;
//                }
//            }
//        }
//        for(int i=0;i<target.length;i++){
//            target[index[i]] = nums[i];
//        }
//        return target;
    }
}
