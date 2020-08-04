package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-24
 */
public class Main665 {
    public static void main(String... args) {
        Main665 main = new Main665();
        System.out.println(main.checkPossibility(new int[]{3, 2, 3, 2, 4}));
    }

    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = nums.length - 1, j = i - 1; i > 0 && j >= 0; i--, j--) {
            if (nums[j] > nums[i]) {
                count++;
                if (j > 0 && nums[--j] > nums[i]) {
                    count++;
                    break;
                }
                i--;
            }
        }
        int count1 = 0;
        for (int i = 0, j = i + 1; i < nums.length - 1 && j <= nums.length - 1; i++, j++) {
            if (nums[j] < nums[i]) {
                count1++;
                if (j < nums.length - 1 && nums[++j] < nums[i]) {
                    count1++;
                    break;
                }
                i++;
            }
        }
        return count <= 1 || count1 <= 1;
    }
}
