package exam;

import java.util.Scanner;

public class Armstrong_num {
	
	
	public boolean checknum(int num)
	{
		int d=num;
		int sum=0;
		while(num>0)
		{
		int rem=num%10;
		num=num/10;
		
		int res=rem*rem*rem;
		sum=sum+res;
	}
	if(sum==d)
	
		return true;
	else
		return false;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		Armstrong_num obj=new Armstrong_num();
		boolean c=obj.checknum(num);
		if(c==true)
		
			System.out.println("arms");
			else
				System.out.println("not arms");
		}
		
		

	}


