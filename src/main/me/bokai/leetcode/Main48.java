package me.bokai.leetcode;

import java.util.Arrays;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-22
 */
public class Main48 {
    public static void main(String... args) {
        Main48 main = new Main48();
        int[][] matrix = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        main.rotate(matrix);
        for (int[] intList : matrix) {
            System.out.println(Arrays.toString(intList));
        }
    }

    private void rotate(int[][] matrix) {
        double n = (matrix.length - 1) / 2.0;
        //y2=2n-x1;x2=y1
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i; j < matrix[i].length - 1 - i; j++) {
                rotate(matrix, i, j, n);
            }
        }
    }

    private void rotate(int[][] matrix, int i, int j, double n) {
        int x2 = 0, y2 = 0;
        int count = 4;
        int temp;
        int next = matrix[i][j];
        do {
            x2 = j;
            y2 = (int) (2 * n - i);
            temp = next;
            next = matrix[x2][y2];
            matrix[x2][y2] = temp;
            i = x2;
            j = y2;
            count--;
        } while (count > 0);
    }
}
