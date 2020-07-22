package me.bokai.leetcode;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author bokai
 * @version 10.0
 * Created by bokai on 2020-07-20
 */
public class Main1338 {

    public static void main(String... args) {
        int[] arr = {1000, 1000, 3, 7};
        System.out.println(minSetSize(arr));
    }

    private static int minSetSize(int[] arr) {

        int length = arr.length;
        Set<Type> types = new TreeSet<>();
        Map<Integer, Integer> typeMap = new TreeMap<>();
        for (int value : arr) {
            if (typeMap.containsKey(value)) {
                typeMap.put((value), typeMap.get(value) + 1);
            } else {
                typeMap.put((value), 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : typeMap.entrySet()) {
            Type type = new Type(entry.getKey(), entry.getValue());
            types.add(type);
        }
        int result = 0;
        int sum = 0;
        for (Type type : types) {
            sum += type.count;
            result++;
            if (sum >= length / 2) {
                return result;
            }
        }
        return result;
    }

    static class Type implements Comparable {
        private int value;
        private int count;

        Type(int value, int count) {
            this.value = value;
            this.count = count;
        }

        @Override
        public int compareTo(Object o) {
            if (o instanceof Type) {
                if (((Type) o).count == this.count) {
                    return Integer.compare(this.value, ((Type) o).value);
                } else {
                    return Integer.compare(((Type) o).count, this.count);
                }
            }
            return 0;
        }
    }
}
