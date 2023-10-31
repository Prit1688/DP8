package com.inheritance;

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
	public void setdd(int dd)
	{
		this.dd=dd;
	}
	public void setmm(int mm)
	{
		this.mm=mm;
	}
	public void setyy(int yy)
	{
		this.yy=yy;
	}
	public int getdd()
	{
		return dd;
	}
	public int getmm()
	{
		return mm;
	}
	public int getyy()
	{
		return yy;
	}

	public static void main(String[] args) {
		
		Mydate s=new Mydate();
		System.out.println(s);
		s.setdd(12);
		s.setmm(04);
		s.setyy(2013);
		System.out.println(s);
		// TODO Auto-generated method stub

	}

}
