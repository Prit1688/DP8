package com.oops;

import java.util.Scanner;

public class Electricitybill {

	int Meternumber, bill;
	long Contactnumber;

	String month, Cname, Email, Adress;

	public void setData(String Month, String canme, String email, String adress, int meternumber, long contactnumber) {

		Meternumber = meternumber;
		Contactnumber = contactnumber;
		month = Month;
		Cname = canme;
		Email = email;
		Adress = adress;

	}

	public void findLitebill(int unit) {
		if (unit < 100)
			bill = unit * 5;
		else if (unit <= 300)
			bill = 500 + (unit - 100) * 8;
		else if (unit > 300)
			bill = 100 * 5 + 200 * 8 + (unit - 300) * 10;
		


	}

	public void disPlay() {
		System.out.println("customer Meternumber " + Meternumber);

		System.out.println("customer Contactnumber " + Contactnumber);

		System.out.println("customer month " + month);

		System.out.println("customer Cname " + Cname);

		System.out.println("customer Email " + Email);
		System.out.println("customer bill " + bill);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter unit");
		int unit = sc.nextInt();

		Electricitybill obj = new Electricitybill();
		obj.setData("october", "abhishek rai", "abhishek@1674", "karve nagar", 786, 8767612677l);
		obj.findLitebill(unit);
		obj.disPlay();

	}

}
