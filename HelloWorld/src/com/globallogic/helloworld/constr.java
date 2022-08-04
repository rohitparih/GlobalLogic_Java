package com.globallogic.helloworld;

class cont{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class constr {
	
	public static void main(String[] args) {
		cont c1 = new cont();
		c1.setName("Rohit");
		System.out.println(c1.getName());
	}
	

}
