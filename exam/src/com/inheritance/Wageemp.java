package com.inheritance;

public class Wageemp extends Employy{
	
	double hrs,rate;
	
	public Wageemp()
	{
		hrs=0;
		rate=0;
	}
	public Wageemp(int eid,String name,double salary,double hrs,double rate,Mydate d)
	{
		super(eid,name,salary,d);
		this.hrs=hrs;
		this.rate=rate;
	}
	public String toString()
	{
		return super.toString()+"HRS"+hrs+"RATE"+rate;
	}
	public double Calculatesalary()
	{
	  double s=super.Calculatesal()+hrs*rate;	
	  super.setsalary(s);
	  return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wageemp obj=new Wageemp(12,"pritam",25000,50,25,new Mydate(23,03,2023));
		obj.Calculatesalary();
		System.out.println(obj);
		

	}

}
