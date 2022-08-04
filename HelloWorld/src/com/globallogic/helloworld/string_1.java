package com.globallogic.helloworld;

public class string_1 {
public static void main(String[] args) {
	StringBuilder str = new StringBuilder("Hello World");
	//reverse a string
	
	for(int i=0 ; i<str.length()/2 ; i++){
		int front=i;
		int back = str.length()-1-i;
		
		char frontch = str.charAt(back);
		char backch = str.charAt(front);
		
		str.setCharAt(front, frontch);
		str.setCharAt(back, backch);
		
	}
	System.out.println(str);
}
}
