package com.easy.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class Main {

    private static List<Integer> filter(List<Integer> list, IntPredicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] test = new Integer[]{1, 2, 3, 4, 5, 6};
        System.out.println(
                Arrays.toString(
                        (filter(
                                Arrays.asList(test),
                                //函数式编程的核心，这个表达式即是Predicate「谓语」
                                //(parameters)->{statement}
                                //箭头前，参数，  test(param)中的param
                                //箭头后，表达式，计算结果的类型是test(param)的返回类型
                                (int i) -> (i % 2 == 0)
                                //可以根据上下文推断类型，就像1.7的菱形运算符
                                //哪种易读灵活选择
//                                i -> (i % 2 == 0)
                        )).toArray()
                )
        );

        List<String> input = Arrays.asList("1", "2", "3", "4");
        input.stream()
                .map(Integer::parseInt)
                .forEach(System.out::print);
    }
}
