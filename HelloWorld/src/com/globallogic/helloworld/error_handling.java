package com.globallogic.helloworld;

public class error_handling {
	static void checkAge(int x) {
		if (x < 18) {
			throw new ArithmeticException("Age is too low");
		} else {
			System.out.println("OK");
		}
	}

	public static void main(String[] args) {
		checkAge(18);
	}

}
