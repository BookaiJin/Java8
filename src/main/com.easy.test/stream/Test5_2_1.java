package com.easy.test.stream;

import java.util.Arrays;
import java.util.List;

public class Test5_2_1 {
    public static void main(String ... args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(
    		Arrays.toString(
                list.stream()
					.map(a -> a * a)
		    .toArray())
        );
    }
}
