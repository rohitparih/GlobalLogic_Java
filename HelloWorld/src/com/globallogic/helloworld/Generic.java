package com.globallogic.helloworld;
import java.util.*;
import java.util.Collections;
public class Generic {
public static void main(String[] args) {
	ArrayList cars = new ArrayList<>();
	cars.add("rohit");
	cars.add("world");
	cars.add("parihar");
	cars.add("hello");
	
	//System.out.println(cars);
//	for(Object ob : cars){
//		System.out.println(ob);
//	}
//	cars.clear();
//	System.out.println(cars);
	
//	System.out.println(cars.contains("rohit"));
//	System.out.println(cars.get(1));
//	cars.add(1, "Parihar");
//	System.out.println(cars);
//	System.out.println(cars.get(1));
//	
//	System.out.println(cars.clone());
	
	Collections.sort(cars);
	System.out.println(cars);

}
}
