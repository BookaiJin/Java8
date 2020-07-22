package me.bokai.leetcode;

import java.util.Arrays;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-21
 */
public class Main189 {
    public static void main(String... args) {
        int[] nums = {-1,-100,3,99};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        rotate(nums, 0, nums.length - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, nums.length - 1);
    }

    private static void rotate(int[] nums, int start, int end) {
        int temp = nums[start];
        for (; start <= end; start++, end--) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }
}
