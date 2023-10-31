package com.Array;

public class Student {

	int roll;
	String name;
	int age,marks;
	
	public Student()
	{
		roll=0;
		name="";
		age=0;
		marks=0;
	}
	public Student(int roll,String name,int age,int marks)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	public void setr(int roll)
	{
		this.roll=roll;
	}
	public void setn(String name)
	{
		this.name=name;
	}
	public void seta(int age)
	{
		this.age=age;
	}
	public void setm(int marks)
	{
		this.marks=marks;
	}
	public int getr()
	{
		return roll;
	}
	public String getn()
	{
		return name;
	}
	public int geta()
	{
		return age;
	}
	public int  getm()
	{
		return marks;
	}
	
	public String toString()
	{
		return "Roll number"+roll+"\n"+"Name"+name+"\n"+"Age "+age +"\n"+"Marks"+marks;
	}

	public static void main(String[] args)
	{
		
		
		 Student s1= new Student();
				 System.out.println(s1);
				 System.out.println("______________________________");
				 Student s2=new Student(1,"pritam",25,68);
				 System.out.println(s2);

}
}
