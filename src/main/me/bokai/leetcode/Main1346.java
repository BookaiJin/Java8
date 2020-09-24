package me.bokai.leetcode;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-23
 */
public class Main1346 {
    public static void main(String... args){
        Main1346 main1346 = new Main1346();
        System.out.println(main1346.checkIfExist(new int[]{14, 2, 1, 7}));
    }

    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; arr[i] < arr[j] && i < j; j--) {
                if (arr[i] * 2 == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
