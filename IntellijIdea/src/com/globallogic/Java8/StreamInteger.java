package com.globallogic.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.stream.Collectors;

public class StreamInteger {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(23,57,4212,47,56,23432,656,241,23,7);
        //Filtering for less than 100 values
        l1.stream().filter(e -> e<100).collect(Collectors.toList()).forEach(System.out::println);

        //Sum
        int sum = l1.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        //Sorting
        List<Integer> sortedl1 = l1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedl1);

        //Min
        System.out.println(l1.stream().min((x, y) -> x.compareTo(y)).get());

        //Max
        System.out.println(l1.stream().max((x, y) -> x.compareTo(y)).get());

        //Output is Optinal[Maximum Value]
        //Optional is also printed because .get() is not implemented .get() is use to get single integer value
        System.out.println(l1.stream().max((a, b) -> a.compareTo(b)));
    }
}
