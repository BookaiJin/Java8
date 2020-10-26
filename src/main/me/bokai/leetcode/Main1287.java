package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-10-26
 */
public class Main1287 {

    public static void main(String... args){
        Main1287 main1287 = new Main1287();
        System.out.println(main1287.findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10}));
    }

    public int findSpecialInteger(int[] arr) {
        int count = arr.length / 4;
        int target = 0;
        int now = arr[0];
        for (int i : arr) {
            if (now == i) {
                target++;
                if (target > count) {
                    return now;
                }
            } else {
                target = 1;
                now = i;
            }
        }
        return arr[0];
    }
}
