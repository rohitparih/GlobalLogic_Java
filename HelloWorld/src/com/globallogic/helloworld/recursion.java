package com.globallogic.helloworld;

public class recursion {

	public static void printNum(int n){
		if(n==0 || n<0){
			return;
		}
		System.out.println(n);
		printNum(n-2);
	}
	public static void main(String[] args) {
		printNum(7);
	}
}
