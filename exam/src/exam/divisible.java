package exam;

import java.util.Scanner;

public class divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		
		if(num%3==0 && num%9==0)
		{
			System.out.println("number is divisible by both 3 or 9");
			
		}
		else if(num%9==0)
		{
			System.out.println("number is divisible by 9");
		}
		else if(num%3==0)
		{
			System.out.println("number is divisible by 3");
		}
		else
		{
			System.out.println("number is not divisible by 3 or 9");
		}
		
		

	}

}
