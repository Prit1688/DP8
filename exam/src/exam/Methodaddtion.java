package exam;

import java.util.Scanner;

public class Methodaddtion {
	
	
	public int addition(int num1,int num2){
		
		
		int num= num1+num2;
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num1=sc.nextInt();
		System.out.println("enter the sec");
		int num2=sc.nextInt();
		Methodaddtion obj=new Methodaddtion();
		int re=obj.addition(num1,num2);
		System.out.println(re);
		
		

	}

}
