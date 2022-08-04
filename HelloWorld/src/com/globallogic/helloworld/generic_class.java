package com.globallogic.helloworld;
// Class should be start be capital alphabet
//should not take any special character in b/w the class name
//use the constructor to initialize the no. variable
//generics parameter should be in capital letter
class student<X,Y>{
	X id;
	Y name;
	X salary;
	
	public student(X id, Y name, X salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	public String toString() {
		return "student [id=" + this.id + ", name=" + this.name + ", salary=" + this.salary + "]";
	}

	public void print(){
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
	}
}

public class generic_class {
	public static void main(String[] args) {
		student<Integer, String> rr = new student<Integer, String>(7, "Rohit", 70000);
		rr.print();
		System.out.println(rr.toString());
	}

}
