package me.bokai.leetcode;

public class Main414 {
    public static void main(String[] args) {
        Main414 main414 = new Main414();
        System.out.println(main414.thirdMax(new int[]{1}));
    }

    public int thirdMax(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        Integer n1 = null;
        Integer n2 = null;
        Integer n3 = null;
        for (int num : nums) {
            if ((n1 != null) && (num == n1)
                    || (n2 != null) && (num == n2)
                    || (n3 != null) && (num == n3)) {
                continue;
            }
            if (n1 == null || num > n1) {
                n3 = n2;
                n2 = n1;
                n1 = num;
                continue;
            }
            if (n2 == null || num > n2) {
                n3 = n2;
                n2 = num;
                continue;
            }
            if (n3 == null || num > n3) {
                n3 = num;
            }
        }
        if(n2 == null && n3 == null){
            return n1;
        }
        return n3;
    }
}