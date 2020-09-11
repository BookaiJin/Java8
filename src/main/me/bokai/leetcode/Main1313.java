package me.bokai.leetcode;

import java.util.Arrays;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-11
 */
public class Main1313 {

    public static void main(String... args) {
        Main1313 main1313 = new Main1313();
        System.out.println(Arrays.toString(main1313.decompressRLElist(new int[]{1, 2, 3, 4})));
    }

    public int[] decompressRLElist(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i += 2) {
            count += nums[i];
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = index; j < index + nums[i]; j++) {
                result[j] = nums[i + 1];
            }
            index += nums[i];
        }
        return result;
    }
}
