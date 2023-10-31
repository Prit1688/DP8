package exam;

import java.util.Scanner;

public class loopingstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		for(int i=1;i<50;i++)
		{
			if(num%3==0)
			{
				System.out.println("think");
			}
			else if(num%5==0)
			{
				System.out.println("thinkqueotient");
			}
		
			else
			{
				System.out.println("invalid");
			}
		}
		

	}

}
