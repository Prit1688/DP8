package com.Abstract;

public class Circle  extends Shape implements Printtable {
	
	double r;
	double pi=3.14;
	
	public  Circle(double r)
	{
		this.r=r;
	}
	public void calculateArea()
	{
		System.out.println(pi*r*r);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle(3.5);
		s.calculateArea();
		Circle c=new Circle(4.8);
		c.calculateArea();
		Shape [] d=new Shape[2];
		
		

	}
	public void show()
	{
		System.out.println("i am in deafult");
	}

}
