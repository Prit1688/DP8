package exam;

import java.util.Scanner;

public class evenoddswitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		switch(num%2)
		{
		
		case 1:System.out.println("odd");
		break;
		
		default :System.out.println("even");
		break;
		
	
		

	}

}
}
