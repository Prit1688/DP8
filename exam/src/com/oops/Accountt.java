package com.oops;

public class Accountt {
	int accno;
	String name;
	double balance;
	
	public void seta(int a)
	{
		this.accno=a;
	}
	public void setn(String n)
	{
		this.name=n;
	}
	public void setb(double b)
	{
		this.balance=b;
	}
	public int  geta()
	{
		return accno;
	}
	public String getn()
	{
		return name;
	}
	public double getb()
	{
		return balance;
	}
	
	public Accountt()
	{
		
		
	}
	public Accountt(int accno,String name,double balance)
	{
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	}
	public String toString()
	{
	return "Accno  "+accno+"Name "+name+"balance "+balance;	
	}

	public static void main(String[] args) {
		
		
		Accountt obj=new Accountt();
		System.out.println(obj);
		
		Accountt obj1=new Accountt(87,"prity",66777);
		System.out.println(obj1);
		
	}

}
