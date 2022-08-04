package com.globallogic.helloworld;

public class fact {
	public static String factorial(){
		return "Enter a valid parameter for factorial";
	}
	public static int factorial(int n){
		if(n==1||n==0){
			return 1;
		}
		
		int fact_1 = factorial(n-1);
		int fact = n * fact_1;
		return fact;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(7));
	}

}
