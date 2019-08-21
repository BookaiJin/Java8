package com.easy.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5_2_2 {
    public static void main(String... args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5);

        List<Integer[]> result = list1.stream()
                .flatMap(i ->
                        list2.stream().map(j -> new Integer[]{i, j}))
                .collect(Collectors.toList());
    }
}
