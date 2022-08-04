package com.globallogic.helloworld;

public class comparable {//implements Comparable<comparable> 
	
	private int id;
	private String name;
	private int ph;
	
	
//	public int compareTo(comparable o) {
//		return this.name.compareTo(o.name);
//	}
	
	comparable(int id, String name, int ph){
		this.id=id;
		this.name=name;
		this.ph=ph;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPh() {
		return ph;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", ph=" + ph + "]";
	}
	
}



