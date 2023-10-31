package com.oops;

public class Static_Employ {

	static int counter = 11;
	int id;
	String name;
	float salary;
	

	public Static_Employ(){
		
		
		
		
		this.id = counter++;
	}
	//public Static_Employ()

	public void setData(String name, float salary) {

		this.name = name;
		this.salary = salary;
		
	}

	public void display() {
		System.out.println("id: " + (id) + " " + name + " " + salary);
	}
	public String toString()//toString method
	{
		
		return id+" "+name+" "+salary;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Employ obj = new Static_Employ();
		Static_Employ obj1 = new Static_Employ();
		Static_Employ obj2 = new Static_Employ();
		obj.setData("prit", 768);
		obj1.setData("pritam", 575);
		obj2.setData("prits", 575);
		obj.display();
		obj1.display();
		obj2.display();
System.out.println(obj);
	}

}
