package exam;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();


		System.out.println("addition,substraction,divide,multi ");
		String choice;
		choice=sc.next();
		


		switch(choice)
		{
		case "add": 
			System.out.println("the add is"+num1+num2);
			break;
		case  "substaction":
			System.out.println("the ubstaction is "+num1-num2);
		
			break;
		case "multi":
			System.out.println("the multi is"+num1*num2);
		
			
			break;
		case "divison":
			System.out.println("the div"+num1/num2);
		
			
			break;
		default:
			System.out.println("invalid");
		}

	}

}
