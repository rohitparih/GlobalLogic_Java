package com.collections.collect;

public class Stringbuilder {
	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("Rohit");
		a.append("Parihar");
		System.out.println(a);
		a.insert(5, ' ');
		System.out.println(a);
		a.setCharAt(5, 'A');
		System.out.println(a);
		a.replace(5, 6, " ");
		System.out.println(a);
		a.reverse();
		System.out.println(a);
		a.reverse();
		System.out.println(a);
		a.deleteCharAt(5);
		System.out.println(a);
		System.out.println(a.lastIndexOf("har"));
		a.insert(5, ' ');
		System.out.println(a);
	}

}
