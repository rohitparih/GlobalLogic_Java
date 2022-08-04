package com.globallogic.helloworld;

import java.util.*;

public class switchcase {
	public static void main(String[] args) {
		
		Scanner gl = new Scanner(System.in);
		System.out.print("Enter the no. ");
		int a = gl.next().charAt(0);
		switch (a){
		case 'A':
			System.out.println("Sunday");
			break;
		case 'B':
			System.out.println("Monday");
			break;
		case 'C':
			System.out.println("Tuesday");
			break;
		case 'D':
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Ok");
		}
	}

}
