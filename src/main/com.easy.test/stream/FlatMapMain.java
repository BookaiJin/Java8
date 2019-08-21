package com.easy.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMain {
    public static void main(String... args) {
        String[] words = new String[]{"hello", "world"};
        System.out.println(Arrays.toString(Arrays.stream(words)
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct().toArray()));
    }
}
