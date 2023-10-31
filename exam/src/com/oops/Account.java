package com.oops;

import java.util.Scanner;

public class Account {
	

	String Accname,Branchname,Ifsccode;
	int Acnumber,balance;
	

	
	public void setData(String accname,String branchname,String ifsccode,int acnumber)
	{
		Accname=accname;
		Branchname=branchname;
		Ifsccode=ifsccode;
		Acnumber=acnumber;
		balance=10000;
		
	}
	
	public void depositeAmount(int amount)
	{
		
		balance=balance+amount;
		System.out.println("After added balance ="+balance);
	}
	public void withDraw(int vc)
	{
		balance=balance-vc;
		System.out.println("after widraw balance ="+balance);
	}
	public void disPlay() 
	{
		
		System.out.println("customer accname  "+Accname);	
		System.out.println("customer Branchname "+Branchname);		
		System.out.println("customer Ifsccode "+Ifsccode);		
		System.out.println("customer Acnumber "+Acnumber);
		//System.out.println("customer balance "+balance);
		
		System.out.println("intial amount "+balance);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Addamount");
		int amount=sc.nextInt();
		
		
		System.out.println("Enetr Witjdrawamount");
		int vc=sc.nextInt();
		
		
		
		
		Account obj=new Account();
		obj.setData("pritam mane", "latur", "sbi9888756456", 786);
		obj.depositeAmount(amount);
		obj.withDraw(vc);
		obj.disPlay();
		

	}

}
