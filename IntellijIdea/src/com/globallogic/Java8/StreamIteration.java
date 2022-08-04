package com.globallogic.Java8;
import java.util.stream.Stream;

public class StreamIteration {
    public static void main(String[] args) {
       // Stream.iterate(1, e -> e+1).filter(e -> e%2==0).limit(10).forEach(System.out::print);
//        Stream.iterate(1, e ->e+1).filter(e -> e%5==0).limit(10).forEach(e -> System.out.println(e));
        System.out.println(Stream.iterate(1, e -> e + 1).limit(10).skip(4).mapToInt(Integer::intValue).sum());
    }
}
