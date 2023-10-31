package com.oops;

public class Static_datamember {

	int id;
	String name;
	long number;
	static String companyname = "thinquotient";//static variable

	public void set(int id, String name, long number) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.companyname = "hsjdhfhs";
	}

	public void display() {
		System.out.println(id + " " + name + " " + number + " " + companyname);
	}

	public static void setcompanyname(String nm)//static method 
	{

		companyname = nm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_datamember obj = new Static_datamember();
		obj.set(78, "prit", 8767612677l);
		obj.display();

	}

}
