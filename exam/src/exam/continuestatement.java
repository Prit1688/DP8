package exam;

import java.util.Scanner;

public class continuestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		
		boolean isprime=true;
		
		
		for(int i=2;i<num;i++)
			
		{
			if(num%i==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime==true)
		{
			System.out.println("number is prime");
		}
		else
			System.out.println("number is not prime");

	}

}
