package com.inheritance;

public class Manager extends Employy {
	
	double noofemp,bonus;
	
	public Manager()
	{
		
	}
	public Manager(int eid,String name,double salary,Mydate d,double noofemp,double bonus)
	{
		super(eid,name,salary,d);
		this.noofemp=noofemp;
		this.bonus=bonus;
	}
	public String toString()
	{
		return super.toString()+noofemp+bonus;
	}
	
	public double Calculatesalary()
	{
		double d=super.Calculatesal()+bonus;
		super.setsalary(d);
		return d;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m1=new Manager(23,"pritya",50000,new Mydate(),34,50);
		m1.Calculatesalary();
		System.out.println(m1);

	}

}
