package com.globallogic.helloworld;
import java.util.*;

public class he {
	public static void main(String[] args) {
		List<comparable> a = new ArrayList<>();
		a.add(new comparable(1, "rohit", 656867735));
		a.add(new comparable(2, "parihar", 746895768));
		a.add(new comparable(3, "fdgdfhg", 756335743));
		a.add(new comparable(4, "tbfgjgh", 685657462));
//		System.out.println(a);
		
		Collections.sort(a, new comparator());
		
		for(int i=0 ; i<a.size() ; i++) {
			System.out.println(a.get(i));
		}
	}
}
