package com.overriding;

//WAP to create a class Kid with method readBook() and another method readBook () with 2
//parameters. The method readBook here is over-loaded (same method name but different
//parameters) Create a class BigKid which extends Kid created above. Implement readBook() differently in
//BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()


public class Kid {
	
	
	
	 public void Readbook()
	 {
	System.out.print("kid");	 
	 }

	 public void Readbook(int i,int j)
	 {
		 System.out.println("bigkid a,b");
	 }



class bigkid extends Kid{

	 public void Readbook()
	 {
		 System.out.println("bigkid");
	 }
	 
	 public void Readbook(int i,int j)
	 {
		 System.out.println("bigkid a,b");
	 }
	 
}
}
