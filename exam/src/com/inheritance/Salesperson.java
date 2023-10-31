package com.inheritance;

public class Salesperson extends Wageemp {
	double sales, comm;

	public Salesperson() {

	}

	public Salesperson(int eid, String name, double salary, double hrs, double rate, Mydate d,double sales,double comm) 
	{

	super(eid,name,salary,hrs,rate,d);
		this.sales=sales;
		this.comm=comm;
	}
	public String toString()
	{
		return super.toString()+sales+comm;
	}
	public double Calculatesalary()
	{
	double d=super.Calculatesalary()+sales*comm;
	super.setsalary(d);
	return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salesperson sa=new Salesperson(23,"prit",50000,50,25,new Mydate(),10000,0.1);
		System.out.println(sa.Calculatesalary());
		System.out.println(sa);
		

	}

}
