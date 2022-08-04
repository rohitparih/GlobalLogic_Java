package com.globallogic.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class objects{
    String name;
    int id;
    long price;
    objects(int id, String name, long price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class StreamMap {
    public static void main(String[] args) {
        List<objects> list = new ArrayList<>();
        list.add(new objects(2,"Laptop",756525));
        list.add(new objects(3,"Mobile",645756));
        list.add(new objects(4,"Desktop",4364576));
        list.add(new objects(5,"CPU",2545754));
        list.add(new objects(6,"Monitor",8432356));

        Map<Integer,Long> l2 = list.stream().collect(Collectors.toMap(p->p.id, p->p.price));
        System.out.println(list.stream().collect(Collectors.toMap(p->p.id, p->p.price)));
    }
}
