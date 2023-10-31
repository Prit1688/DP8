package com.containment;

public class Mydate {
 
	int dd,mm,yy;
	public Mydate()
	{
		dd=0;
		mm=0;
		yy=0;
	}
	public Mydate(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void setd(int dd)
	{
		this.dd=dd;
	}
	public void setm(int mm)
	{
		this.mm=mm;
	}
	public void sety(int yy)
	{
		this.yy=yy;
	}
	public int getd()
	{
		return dd;
	}
	public int getm()
	{
		return mm;
	}
	public int gety()
	{
		return yy;
	}
	public String toString()
	{
		return "date"+dd+"month"+mm+"year"+yy;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mydate obj=new Mydate();
		System.out.println(obj);
		
		Mydate obj1=new Mydate(12,04,2023);
		System.out.println(obj1);
		
				

	}

}
