package com.inheritance;
// Create a class Teenager which extends Kid created above (#14). Implement 
//readBook() differently in Teenager class. In main method, declare 2 variables k1, 
//k2 of type Kid. Create objects of type BigKid and Teenager such that K1 should 
//reference object of class BigKid and K2 should reference object of class Teenager. 
//Call their respective readBook() methods. The output is different from both the 
//method calls even if the variable type is the same i.e. Kid. This is compile time 
//polymorphism example.
public class Teenger extends kidjava{
	

	public void readbook()
	{
		System.out.println("i am teenger");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	kidjava k1;
	kidjava k2;
	k1=new bigkid();
	k2=new Teenger();
	k1.readbook();
	k2.readbook();

	}

}
