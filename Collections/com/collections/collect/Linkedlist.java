package com.collections.collect;

import java.util.*;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.addLast(70);
		int n = Integer.parseInt("7");
		list.addFirst(n);
		list.add(4, null);
		
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}
