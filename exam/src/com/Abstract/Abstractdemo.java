package com.Abstract;

   public abstract class Abstractdemo {
	   
	   Abstractdemo()
	   {
		  
	   }
	   
	   public abstract void  bike1();	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstractdemo a=new bike2();
		bike2 b=new bike2();
		b.bike3();
		a.bike1();
		
	
	}

}
   class   bike2 extends Abstractdemo {
	   
	public void bike1()
	{
	System.out.println("hi");	
	}
	
	public void bike3()
	{
		System.out.println("hlo");
	}
	   
   }




