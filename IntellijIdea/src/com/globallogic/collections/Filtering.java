package com.globallogic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product{
    int id;
    String name;
    float price;
    Product(int id, String name, float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class Filtering {
    public static void main(String[] args) {
        List<Product> plist = new ArrayList<>();
        plist.add(new Product(1,"Mobile", 55000f));
        plist.add(new Product(2,"Laptop", 70000f));
        plist.add(new Product(3,"Desktop", 160000f));
        plist.add(new Product(4,"Headset", 2000f));
        plist.add(new Product(5,"Monitor", 20000f));

        //Comparator implementation
        Collections.sort(plist, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        //ForEach loop to print the data of plist
        for(Product p : plist){
            System.out.println(p.id + p.name + p.price);
        }

        //Filtering the data of Product to price only
        List<Float> ilist = new ArrayList<>();
        for(Product product : plist){
            if(product.price<70000f){
                ilist.add(product.price);
            }
        }
        System.out.println(ilist);
    }
}
