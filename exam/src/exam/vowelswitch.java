package exam;

import java.util.Scanner;

public class vowelswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a': System.out.println("vowel");
		break;
		case 'e': System.out.println("voewl");
		break;
		case 'i': System.out.println("vowel");
		break;
		case 'o': System.out.println("voewl");
		break;
		case 'u': System.out.println("voewl");
		break;
		case 'A': System.out.println("vowel");
		break;
		case 'E': System.out.println("voewl");
		break;
		case 'I': System.out.println("vowel");
		break;
		case 'O': System.out.println("voewl");
		break;
		case 'U': System.out.println("voewl");
		break;
		default: System.out.println("con");
		
		}

	}

}
