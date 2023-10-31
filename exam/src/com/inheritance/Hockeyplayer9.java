package com.inheritance;

public class Hockeyplayer9 extends player9 {
	
	String position;
	int jersayno;
	public Hockeyplayer9()
	{
		System.out.println("i am deafault constrtuctor hockey ");
	}
	public Hockeyplayer9 (int age, String name, double salary, String gender,String position,int jersayno)
	{
		
		super(age,name,salary,gender);
		System.out.println("i am parmetrised constrtuctor ");
		position="";
		jersayno=0;
	}
	public String toString()
	{
		return super.toString()+"player position"+position+"player jersayno"+jersayno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hockeyplayer9 obj=new Hockeyplayer9();
		System.out.println(obj);
		Hockeyplayer9 s=new Hockeyplayer9(24,"pritam",98000,"male","teamLeader",45);
		System.out.println(s);
		
		
		
	}

}
