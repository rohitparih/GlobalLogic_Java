package com.java8;

import java.util.ArrayList;
import java.util.List;

public class LamdaForeach {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        //Lamda Function for use ForEach loop
        l1.forEach((n) -> System.out.println(n));
    }
}
