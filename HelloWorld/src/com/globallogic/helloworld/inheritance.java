package com.globallogic.helloworld;

import java.util.*;

class calling_device {
	int model_no;
	int year;
	int code = 70;

	
	@Override
	public String toString() {
		return "[model_no=" + model_no + ", year=" + year + ", code=" + code + "]";
	}

	public int getModel_no() {
		return model_no;
	}

	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void cd() {
		System.out.println("Calling device consist of two types Mobile and Telephone");
	}
}

class mobile extends calling_device {
	String mname;

	public void mcode() {
		System.out.println("Mobile Code is " + super.code);
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

}

class telephone extends calling_device {
	String tname;

	public void tcode() {
		System.out.println("Telephone code is " + super.code);
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

}

public class inheritance {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		calling_device cade = new calling_device();

		mobile mrohit = new mobile();
		mobile maditya = new mobile();

		telephone trohit = new telephone();
		telephone taditya = new telephone();

		cade.cd();
		System.out.println("1 Rohit Mobile");
		System.out.println("2 Rohit telephone");
		System.out.println("3 Aditya Mobile");
		System.out.println("4 Aditya Telephone");
		System.out.println("\n");
		System.out.print("Please select the appropriate option ");
		int a = sc.nextInt();

		switch (a) {

		case 1:
			mrohit.mcode();
			mrohit.setModel_no(234235);
			mrohit.setYear(2020);
			mrohit.setMname("M-5457");
			System.out.println("Model Number " + mrohit.getModel_no());
			System.out.println("Manufacturer year " + mrohit.getYear());
			System.out.println("Handset Name " + mrohit.getMname());
			System.out.println(mrohit.toString());
			break;

		case 2:
			trohit.tcode();
			trohit.setModel_no(756765);
			trohit.setYear(2005);
			trohit.setTname("BSNL");
			System.out.println("Model Number " + trohit.getModel_no());
			System.out.println("Manufacturer year " + trohit.getYear());
			System.out.println("Device name " + trohit.getTname());
			System.out.println(trohit.toString());
			break;

		case 3:
			maditya.mcode();
			maditya.setModel_no(65745);
			maditya.setYear(2022);
			maditya.setMname("M-8653");
			System.out.println("Model Number " + maditya.getModel_no());
			System.out.println("Manufacturer year " + maditya.getYear());
			System.out.println("Handset Name " + maditya.getMname());
			System.out.println(maditya.toString());
			break;

		case 4:
			taditya.tcode();
			taditya.setModel_no(89673);
			taditya.setYear(2006);
			taditya.setTname("MTNL");
			System.out.println("Model Number " + trohit.getModel_no());
			System.out.println("Manufacturer year " + trohit.getYear());
			System.out.println("Device name " + trohit.getTname());
			System.out.println(taditya.toString());
			break;

		default:
			System.out.println("Please select the appropriate option in the index of 1 to 4");
			break;
		}
	}
}
