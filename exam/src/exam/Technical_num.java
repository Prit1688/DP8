package exam;

import java.util.Scanner;

public class Technical_num {
	
	
	public boolean checknum(int num)
	{
		int originalnumber=num;
		int sum=0;
		int rem=num%100;
		num=num/100;
		sum=rem+num;
		sum=sum*sum;
		
		if(sum==originalnumber)
		return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		Technical_num obj=new Technical_num();
		boolean res=obj.checknum(num);
		if(res)
			System.out.println("technical num");
			else
				System.out.println(" not technical num");
				
			
		}
		

	}


