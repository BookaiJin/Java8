package com.easy.test.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMain {
    public static void main(String ... args){
        String[] words = new String[]{"hello","world"};
        List<String> result = Arrays.asList(words).stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(result.toArray()));
    }
}
