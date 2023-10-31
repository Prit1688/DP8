package com.oops;

public class MyEmployee {

	int eid;
	String ename,edesigantion,eEmail,eaddress;
	long econtact;
	double esalary;
	boolean efulltimestatus;
	
	public void setdata(int id,String name,String desigantion,String Email,String address,long contact,double salary,boolean fulltimestatus )
	{
		eid=id;
		ename=name;
		edesigantion=desigantion;
		eEmail=Email;
		eaddress=address;
		econtact=contact;
		esalary=salary;
		efulltimestatus=fulltimestatus;
		
		
	}
	
	public void display()
	{

		System.out.println("Employ id "+eid);
		System.out.println("Employ Name "+ename);
		System.out.println("Employ desigantion "+edesigantion);
		System.out.println("Employ Email "+eEmail);
		System.out.println("Employ address "+eaddress);
		System.out.println("Employ contact "+econtact);
		System.out.println("Employ salary "+esalary);
		System.out.println("Employ fulltimestatus "+efulltimestatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEmployee obj=new MyEmployee();
	
		obj.setdata(1, "pritam", "Hr"," pritammane@1688", "Kothrud", 8767612677L, 7686.89,true);
		obj.display();
		
		
		
		

		
		
	}

}
