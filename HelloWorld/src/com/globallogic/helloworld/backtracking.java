package com.globallogic.helloworld;

// Time Complexity O(n * n!)

public class backtracking {
	public static void backTracking(String str, String perm, int index){
		if(str.length()==0){
			System.out.println(perm);
			return;
		}
		for(int i=0 ; i<str.length() ; i++){
			char currChar = str.charAt(i);
			String newstr = str.substring(0, i) + str.substring(i+1);
			backTracking(newstr, perm+currChar, index+1);
		}
	}
	public static void main(String[] args) {
		
		backTracking("ABC", "", 0);
		
	}
}
