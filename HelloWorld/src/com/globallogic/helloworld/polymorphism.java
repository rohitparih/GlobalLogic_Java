package com.globallogic.helloworld;

class person{
	public void work(){
		System.out.println("Going for work");
	}
}

class school extends person{
	public void work(){
		System.out.println("Going to school");
	}
	
	public void work(int a, String aa){
		System.out.println(a + " " + aa);
	}
}

public class polymorphism {

	public static void main(String[] args) {
		
		person pp = new person();
		pp.work();
		
//		pp = new school();
		pp = new school();
		pp.work(8, "hehe");
		
	}
}
