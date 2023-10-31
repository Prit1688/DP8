package com.inheritance;

public class player9 {

	int age;
	String name;
	double salary;
	String gender;

	public player9() {
		
		System.out.println("i am deafault constrtuctor ");
		age = 0;
		name = "";
		salary = 0.0;
		gender = "";

	}

	public player9(int age, String name, double salary, String gender) {
		
		System.out.println("i am parmeterised constrtuctor ");

		this.age = age;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String toString() {
		return "Player age" + age + "Player name" + name + "Player salary" + salary + "player gender" + gender;
	}
	

}
