package exam;

import java.util.Scanner;

public class Frequency {
	
	
	public void checknum(int num)
	{
		for(int i=1;i<10;i++) 
		{
			
		
		int cnt=0;
		int temp=num;
		while(temp>0)
		{
			int rem=temp%10;
			
			if(rem==i)
				cnt++;
			temp=temp/10;
		}
		if(cnt>0)
			System.out.println(i+" "+cnt);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any frequency");
		int num=sc.nextInt();
		
		Frequency obj=new Frequency();
		obj.checknum(num);
		
		
	}

}
