package com.collections.collect;

import java.util.Iterator;
import java.util.LinkedList;

public class iterator {
	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<>();
		a.add(5);
		a.addFirst(4);
		a.addFirst(3);
		a.addFirst(2);
		a.addFirst(1);
		a.add(6);
		
		Iterator<Integer> a1 = a.iterator();
		
//		System.out.println(a1.next());
		
		while(a1.hasNext()) {
			System.out.println(a1.next());
			a1.remove();
		}
		
		System.out.println(a1.hasNext());
		
		a.add(6);
		System.out.println(a1.hasNext());
	}
}
