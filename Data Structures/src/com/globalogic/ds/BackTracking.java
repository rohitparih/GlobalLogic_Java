package com.globalogic.ds;

public class BackTracking {
	public static void BT(String str, String perm, int index){
		if(str.length()==0){
			System.out.println(perm);
			return;
		}
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			String newstr = str.substring(0, i) + str.substring(i+1);
			BT(newstr, perm+ch, index+1);
		}
	}
	public static void main(String[] args) {
		BT("ABC", "", 0);
	}
}
