package com.globallogic.helloworld;

public class myencapsulation {
//	static int a = 50;
//	static int b=10;
	public static void main(String[] args) {
		byte x = 64;
		int i;
		byte y;
		i = x << 2;
		y = (byte) (x << 2);
		System.out.print(i + " " + y);
//		a += b--;
//		System.out.println(a);
	}
}
