package com.globallogic.helloworld;


class employee{
	int id;
	int salary;
	String name;
	
	public void details(){
		System.out.println("ID is " + id);
		System.out.println("Name is " + name);
	}
	
	public int salary_1(){
		return salary;
	}
	
}


class vehicle{
	int vehicle_no;
	int year;
	String vname;
	
	public int getVehicle_no() {
		return vehicle_no;
	}
	public void setVehicle_no(int vehicle_no) {
		this.vehicle_no = vehicle_no;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void vehicle_name(){
		System.out.println("Name of Vehicle is " + vname);
	}	
}


class address{
	int pincode;
	String city;
	String state;
	String country;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}

public class methods {
	public static void main(String[] args) {
		
		
		employee rohit = new employee();
		employee aditya = new employee();
		
		rohit.id=7;
		rohit.salary=1000000;
		rohit.name="Rohit";
		
		aditya.id=2;
		aditya.salary=700000;
		aditya.name="Aditya";
		
	
		
		
		
		address radd = new address();
		address aadd = new address();
		
		radd.setPincode(313001);
		radd.setCity("Udaipur");
		radd.setState("Rajasthan");
		radd.setCountry("India");

		aadd.setPincode(140301);
		aadd.setCity("Mohali");
		aadd.setState("Punjab");
		aadd.setCountry("India");
		
		
		
		
		vehicle rohitv = new vehicle();
		vehicle adityav = new vehicle();
		rohitv.setVehicle_no(00007);
		rohitv.setYear(2002);
		
		adityav.setVehicle_no(00002);
		adityav.setYear(2000);
		
		rohitv.vname = "Honda";
		adityav.vname = "Suzuki";
	
		
		
		
		
		
		
	
		
		
	
		//rohit details
		

		rohit.details();
		System.out.println(rohit.salary_1());
		System.out.println("Rohit's Address " + radd.getPincode() +" "+ radd.getCity() +" "+ radd.getState() + " "+radd.getCountry());
		rohitv.vehicle_name();
		System.out.println("Vehicle No. is " + rohitv.getVehicle_no());
		System.out.println("Year of Manufacture is " + rohitv.getYear());
		
		System.out.println("\n\n");
		//aditya details
		
		aditya.details();
		System.out.println(aditya.salary_1());
		System.out.println("Aditya's Address  " + aadd.getPincode() +" "+ aadd.getCity() +" "+ aadd.getState() +" "+ aadd.getCountry());
		adityav.vehicle_name();
		System.out.println("Vehicle No. is " + adityav.getVehicle_no());
		System.out.println("Year of Manufacture is " + adityav.getYear());
		
	}
	

}
