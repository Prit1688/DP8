package exam;

import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("positive");
		}
		else if(num<0)
		{
			System.out.println("nrgative");
		}
	}

}
