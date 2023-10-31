package com.inheritance;
//create a class BigKid which extends Kid created above. Implement readBook() 

//differently in BigKid class. Here the method readBook() has been over-ridden in 
// the child class BigKid()

public class bigkid extends kidjava {

	public void readbook() {
		System.out.println("hh");
	}

	public static void main(String[] args) {

		bigkid b = new bigkid();
		b.readbook();
	}

}
