package com.globallogic.helloworld;


interface Mobiles{
	public void calling();
	public void sms();
}

class sumsung implements Mobiles{
	public void calling(){
		System.out.println("Calling Samsung");
	}
	public void sms(){
		System.out.println("Sending Samsung");
	}
}

class Apple implements Mobiles{
	public void calling(){
		System.out.println("Calling Apple");
	}
	public void sms(){
		System.out.println("Sending Apple");
	}
}

public class inter_face {
	public static void main(String[] args) {
		
		
		Mobiles sam = new Apple();
		sam.calling();
		sam.sms();
		
//		sumsung sam = new sumsung();
//		sam.calling();
//		sam.sms();
		
//		Moblies app = new Apple();
	
		
		Mobiles newm = new Mobiles(){
			public void calling(){
				System.out.println("Calling New");
			}
			public void sms(){
				System.out.println("Sending New");
			}
		
		};
		
		newm.calling();
		newm.sms();
		
		
	}

}
