package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-07
 */
public class Main1572 {
    public int diagonalSum(int[][] mat) {
        int count = mat.length;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += mat[i][count - 1 - i];
            sum += mat[i][i];
        }
        if (count % 2 == 1) {
            sum -= mat[count / 2][count / 2];
        }
        return sum;
    }
}

