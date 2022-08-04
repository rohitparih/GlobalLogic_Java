package com.globallogic.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,7,3,78,4,2,96);
        //list.stream().sorted().forEach(System.out::println);
        //list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        //System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        list.stream().filter(e -> e>4).collect(Collectors.toList());
        System.out.println(list);
    }
}
