package exam;

import java.util.Scanner;

public class powerloppingstatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number");
		int base=sc.nextInt();
		System.out.println("enter the exponent");
		int expo=sc.nextInt();
		int power=1;
		
		for(int i=1;i<=expo;i++)
		{
			power=power*base;
		}
		System.out.println(power);

	}

}
