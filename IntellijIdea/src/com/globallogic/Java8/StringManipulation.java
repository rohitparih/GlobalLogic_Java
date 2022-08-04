package com.globallogic.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class StringManipulation {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("Rohit" ,"Aditya" , "Singh" , "Kumar" , "Sharma");
        System.out.println(l1.stream().filter(e -> e.startsWith("S")).collect(Collectors.toList()));
    }
}
