package com.containment;

public class Employy {
	
	 private int id;
	 private String name;
	 private double salary;

	 
	 public Employy()
	 {
		 id=0;
		 name="";
		 salary=0;
	 }
	 public Employy(int id,String name,double salary)
	 {
		this.id=id;
		this.name=name;
		this.salary=salary;
	 }
	 public void setid(int id)
	 {
		this.id=id; 
	 }
	 public void setname(String name)
	 {
		this. name=name;
	 }
	 public void setsal(double salary) 
	 {
		this. salary=salary;
	 }
	 public int  getid()
	 {
		return id; 
	 }
	 public String getnam()
	 {
		 return name;
	 }
	 public double getsal()
	 {
		 return salary;
	 }
	 public String toString()
	 {
		 return "id ="+id+"\n"+"Name = "+name+"\n"+"Salary= "+salary;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employy obj=new Employy();
			System.out.println(obj);
			
			Employy obj1=new Employy(1,"prit",70000);
			System.out.println(obj1);
	

	}

}
