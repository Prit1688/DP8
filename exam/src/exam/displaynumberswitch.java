package exam;

import java.util.Scanner;

public class displaynumberswitch {

	public static void main(String[] args) {
		
	 for(int i=1;i<5;i++)
		{
			switch(i)
			{
			case 1 :System.out.println("one");
			break;
			case 2:System.out.println("two");
			break;
			
			case 3:System.out.println("three");
			break;
			case 4:System.out.println("four");
			break;
			case 5:System.out.println("five");
			break;
			default :System.out.println("invalid");
			}
		}

	}

}
