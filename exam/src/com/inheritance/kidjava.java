package com.inheritance;
//1. WAJP2 create a class Kid with method readBook() and another method 
//readBook () with 2 parameters. The method readBook here is over-loaded (same 
//method name but different parameters)

public class kidjava {
	
	public void readbook()
	{
		System.out.println("hi");
	}
	public void readbook(int i,int j)
	{
	System.out.println("hllo");	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kidjava k=new kidjava();
		k.readbook();
		k.readbook(10, 20);
				

	}

}
