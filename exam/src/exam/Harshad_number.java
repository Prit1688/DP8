package exam;

import java.util.Scanner;

public class Harshad_number {
	
	
	
	
	public boolean checknum(int num)
	
	{
		int sum=0;
		int d=num;
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		if(d%sum==0)
			
		return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		Harshad_number obj=new Harshad_number();
		boolean res=obj.checknum(num);
		if(res==true)
		{
			System.out.println("harshd number");
			
		}
		else
			System.out.println("not harshad");
		
		

	}

}
