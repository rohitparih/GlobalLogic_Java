package com.globallogic.helloworld;

public class factorial {
	public static void main(String[] args) {
		int a = 5;
		int fact = 1;
		for(int i=a ; i>0 ; i--){
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
