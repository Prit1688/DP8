package com.inheritance;

public class Employy {
	
	int eid;
	String name;
	double salary;
	 Mydate doj;
		
	public Employy()
	{
		eid=0;
		name="";
		salary=0;
		doj=new Mydate();
		
	}
	public Employy(int eid,String name,double salary,Mydate d)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		doj=d;
		
	}
	public void seteid(int eid)
	{
		this.eid=eid;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setsalary(double salary)
	{
		this.salary=salary;
	}
	public void setdoj(Mydate o)
	{
		doj=o;
	}
	public int geteid()
	{
		return eid;
	}
	public String getname()
	{
		return name;
	}
	public double getsalary()
	{
		return salary;
	}
	public Mydate getobj()
	{
		return doj;
	}
	public String toString()
	{
		return "Employee ID "+eid+"\n"+"Employee Name "+name+"\n"+"Employee salary "+salary+doj;
	}
	public double Calculatesal()
	{
		return salary;
	}
	public void print(Employy d[])
	
	
	{
		String s="";
		
		for(int i=0;i<d.length;i++)
		{
		if(d[i] instanceof Salesperson )
			s="Wageemp";
		else if(d[i] instanceof Wageemp  )
			s="Salesperson";
		else if(d[i] instanceof Manager)
			s="manager";
		else
		s="Employy";
		
		System.out.println(s);
		System.out.println(d[i]);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employy obj=new Employy();
		System.out.println(obj);
		System.out.println("__________________________");
		
		Employy obj1=new Employy(23," pritam",25000,new Mydate(23,04,2024));
		System.out.println(obj1);
		
		
		Employy[] a=new Employy[4];
		a[0]=new Employy(1,"pritam",25000,new Mydate(24,10,2023));
		a[1]=new Wageemp(2,"ashish",26000,100,50,new Mydate(25,10,2023));
		a[2]=new Salesperson(3,"suraj",27000,100,50,new Mydate(26,10,2023),20,10.5);
		a[3]=new Manager(4,"raghav",28000,new Mydate(27,10,2023),20,10.5);
		
		obj1.print(a);
		
		
		
		

	}

}
