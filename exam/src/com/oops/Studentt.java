package com.oops;

public class Studentt {
	
	int studentroll,studentsal;
	String studentname;
	
	public void setData(int sroll, int ssaal,String sname)
	{
		studentroll=sroll;
		studentsal=ssaal;
		studentname=sname;
		
	}
	public void display()
	{
		System.out.println(studentroll+" "+studentsal+" "+studentname);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentt obj=new Studentt();
		obj.setData(34, 56,"pritam");
		obj.display();

	}

}
