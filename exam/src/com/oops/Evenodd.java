package com.oops;

import java.util.Scanner;

public class Evenodd {
	
	
	public void sumDigit(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
		
		if(rem%2==0)
			sum=sum+rem;
		}
		System.out.println(sum);
		
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		Evenodd obj=new Evenodd();
		obj.sumDigit(num);
		
		
		

	}

}
