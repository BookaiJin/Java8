package me.bokai.leetcode;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-20
 */
public class Main959 {

    public static void main(String... args) {
        String[] grid = new String[]{
                "//",
                "/ "
        };
        regionsBySlashes(grid);
    }

    private static int regionsBySlashes(String[] grid) {
        class Metric{
            boolean goal = false;

        }

        int n = grid.length;
        int metricN = n+1;
        boolean[][] metric = new boolean[metricN][metricN];
        for (int i = 0; i < metricN; i++) {
            for (int j = 0; j < metricN; j++) {
                if (i == 0 || i == metricN - 1 || j == 0 || j == metricN - 1) {
                    metric[i][j] = true;
                }
            }
        }
        for (int i = 0; i < metricN; i++) {
            for (int j = 0; j < metricN; j++) {
                System.out.print("·");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                if (grid[i].charAt(j) == '\\') {
                    metric[i][j] = true;
                    metric[i + 1][j + 1] = true;
                    j++;
                } else if (grid[i].charAt(j) == '/') {
                    metric[i][j + 1] = true;
                    metric[i + 1][j] = true;
                }
            }
        }
        return n;
    }


}
