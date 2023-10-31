package com.Array;

//wap to print the employyes from employy [] array who has same joining date
//you have employy class  which has 4 attributes id,name,salary,date
// data is another object which has 3 attributes day,month,year
// and add employy object to your array

public class Employy {

	int id,salary;
	String name;
	float date;
	
	public Employy()
	{
		id=0;
		salary=0;
		name="";
		date=0;
	}
	public Employy(int id,int salary,String name,float date)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.date=date;
	}
	
	public void getid(int id)
	{
		this.id=id;
	}
	public void getsalary(int salary)
	{
		this.salary=salary;
	}
	public void getname(String name)
	{
		this.name=name;
	}
	public void getdat(float date)
	{
		this.date=date;
	}
	public int  setid()
	{
		return id;
	}
	public int setsalary()
	{
		return salary;
	}
	public String setname()
	{
		return name;
	}
	public float setdat()
	{
		return date;
	}
	
	public  String toString()
	{
		return id+salary+name+date; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  
	}

}
