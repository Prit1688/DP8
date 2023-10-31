package exam;

import java.util.Scanner;

public class Big_armsstrong {
	
	
	public int digitcnt(int num)
	{
		int cnt=0;
		while(num!=0)
		{
			num=num/10;
			cnt++;
		}
		return cnt;
	}
	public int power(int b,int e)
	{
		int power=1;
		for(int i=0;i<e;i++)
		{
			power=power*b;
		}
			return power;
		
	}
	public boolean checkarmsrong(int num)
	{
		int cnt=digitcnt(num);
		int sum=0;
		int temp=num;
				
	
	
	while(num!=0)
	{
		int rem=num%10;
		num=num/10;
		sum=sum+power(rem,cnt);
}
	if(sum==temp)
	
		return true;
		else
			return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();		
		
		Big_armsstrong obj=new Big_armsstrong();
		boolean res=obj.checkarmsrong(num);
		if(res)
		{
				System.out.println("arms");
		}
			else
				
			{
				System.out.println("not");
			}
		
		
		
	}

}
