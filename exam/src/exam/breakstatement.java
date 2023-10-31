package exam;

import java.util.Scanner;

public class breakstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number");
		int num=sc.nextInt();
		int cnt=0;
		
		 for(int i=2;i<num;i++)
		 {
			 if(num%i==0)
			 {
				cnt=1;
				break;
				
			 }
			 else if(num%9==0)
			 {
				 System.out.println("divisible by 9");
				 break;
				 
			 }
			 else
				 continue;
		 }

	}

}
