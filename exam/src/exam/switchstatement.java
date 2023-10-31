package exam;

import java.util.Scanner;

public class switchstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char");
		String happy=sc.next();
		
		switch(happy)
		{
		case "name":System.out.println("Name");
		break;
		case "happy":System.out.println("Happy");
		break;
		case "pritam":System.out.println("Pritam");
		break;
		default : System.out.println("khaalli hai");
		}

	}

}
