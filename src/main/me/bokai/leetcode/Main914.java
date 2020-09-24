package me.bokai.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-09-23
 */
public class Main914 {

    public static void main(String... args) {
        Main914 main914 = new Main914();
        System.out.println(main914.hasGroupsSizeX(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2}));
    }

    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 1) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : deck) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            map.putIfAbsent(i, 1);
        }
        int[] ints = new int[map.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ints[i] = entry.getValue();
            i++;
        }
        Arrays.sort(ints);
        if (ints.length == 1) {
            return true;
        }
        int x = ints[0];
        int y = ints[1];
        int min = -1;
        for (int j = 2; j <= x && j <= y; j++) {
            if (x % j == 0 && y % j == 0) {
                min = j;
                break;
            }
        }
        if (min < 0) {
            return false;
        }
        for (int j : ints) {
            if (j % min != 0) {
                return false;
            }
        }
        return true;
    }
}
