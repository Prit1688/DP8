package com.oops;

public class Student {
	
	int id,subject1,subject2,subject3,subject4;
	String name,addres,Emial;
	long contact;
	
	
	public void setdata(int eid,String ename,String eadress,String email,long conatct,int Subject1,int Subject2,int Subject3,int Subject4)
	{
		id=eid;
		name=ename;
		addres=eadress;
		Emial=email;
		contact=conatct;
		subject1=Subject1;
		subject2=Subject2;
		subject3=Subject3;
		subject4=Subject4;	
	}
	

	public void calculatepercentage()
	
	{
		
		
		
		int percentage=(subject1+subject2+subject3+subject4)*100/400;
		System.out.println("percentage="+percentage);
		
		
		
	}
	public void display()
	{
		System.out.println("student id"+id);
		System.out.println("Student name "+name);
		System.out.println("Student addres "+addres);
		System.out.println("Student Email "+Emial);
		System.out.println("Student contact "+contact);
		System.out.println("Student subject marathi "+subject1);
		System.out.println("Student subject English "+subject2);
		System.out.println("Student subject hindi "+subject3);
		System.out.println("Student subject math "+subject4);
		
	}
	
	

	public static void main(String[] args) {
		Student obj=new Student();
		obj.setdata(1, "pritam", "shree nagar","pritam@1688", 8767612677l, 68, 77, 87, 92);
	obj.display();
obj.calculatepercentage();
		
		

	}

}
