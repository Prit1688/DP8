package com.inheritance;

public class IPLteam {
	
	public void play()
	{
	System.out.println("yyy");	
	}
	public static void main(String[] args) {
		
	}
}
 class csk extends IPLteam
{
	public static void main(String[] args) {
		
		
		csk c=new csk();
		c.play();
	}
}
 class rcb extends IPLteam
{
	public static void main(String[] args) {
		
		rcb r=new rcb();
		r.play();
	}
	
}

