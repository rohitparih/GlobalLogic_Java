package com.globallogic.helloworld;

public class sum_of_n_natural_numbers_using_recursioon {

	public static void add(int i, int sum, int n){
		if(i==n){
			sum+=i;
			System.out.println(sum);
			return;
		}
		sum+=i;
		System.out.println(i);
		add(i+1, sum, n);
	
		
	}
	public static void main(String[] args) {
		add(1,0,5);
	}
}
