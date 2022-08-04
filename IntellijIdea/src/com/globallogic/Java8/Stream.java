package com.globallogic.Java8;

import java.util.*;
import java.util.stream.Collectors;


class Product{
    int id;
    String name;
    long price;
    Product(int id, String name, long price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class Stream {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"Mobile", 55000));
        list.add(new Product(2,"Laptop", 70000));
        list.add(new Product(3,"Desktop", 160000));
        list.add(new Product(4,"Headset", 2000));
        list.add(new Product(5,"Monitor", 20000));

//        List<Long> ilist =list.stream()
//        .filter(e -> e.price <70000)  Filtering the data as per our need
//        .map(p -> p.price)
//        .collect(Collectors.toList());


        List<Integer> ilist = list.stream()
                .map(p -> p.id) // Fetching Data
                        .sorted(Collections.reverseOrder()) //Sorting in reverse order
                                .collect(Collectors.toList()); // collecting in a list
        System.out.println(ilist);

    }
}
