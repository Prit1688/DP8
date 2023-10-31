package com.oops;

import java.util.Scanner;

public class Employydeatails {
	
	int eid;
	String ename,Email;
	double basicsal,pf,hra,da,netsal;
	
	public void setdata(int id,String name,String email,double Basicsalary)
	{
		eid=id;
		ename=name;
		Email=email;
		basicsal=Basicsalary;
		
	}
	public void findpf()
	{
		 pf=basicsal*0.10;
	}
public void findDa()
{
	da=basicsal*0.20;
}
public void findHra()//camelCase
{
	hra=basicsal*0.15;
}
public void calculatenetsal()
{
	netsal=basicsal-pf+da+hra;
}
public void display()
{
	System.out.println("Employ eid "+eid);
	System.out.println("Employ ename "+ename);
	System.out.println("Employ Email "+Email);
	System.out.println("Employ Basicsalary "+basicsal);
	System.out.println("Employ Pf  "+pf);
	System.out.println("Employ Da "+da);
	System.out.println("Employ Hra "+hra);
	System.out.println("Employ Netsal "+netsal);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employydeatails obj=new Employydeatails();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter eid");
	int e=sc.nextInt();
	System.out.println("Enter employee name");
	String nm=sc.next();
	
	obj.setdata(e, nm, "pri@1688", 50000);
	obj.findDa();
	obj.findHra();
	obj.findpf();
	obj.calculatenetsal();
	
	obj.display();
	

	}

}
