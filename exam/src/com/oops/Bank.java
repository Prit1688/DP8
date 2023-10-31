package com.oops;

public class Bank {

	String bankname;
	double ifsccode;
	Account ai;

	public Bank() {
		bankname = "sbi";
		ifsccode = 8686;
		ai = new Account();
	}

	public Bank(String name, double ifsccode, Account ai) {
		this.bankname = name;
		this.ifsccode = ifsccode;
		this.ai = Account;
	}

	public void setbname(String banknamee)

	{
		banknamee = bankname;
	}

	public void setif(double ifsc) {
		ifsc = ifsccode;
	}

	public String toString() {
		return "Bnakname =" + bankname + "\n" + "Bank IFSCCODE =" + ifsccode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank obj = new Bank();
		System.out.println(obj);

		Accountt obj1 = new Accountt(877866778, "prit", 67000);

		Bank obj2 = new Bank("SBI", 784.78, obj1);
		System.out.println(obj2);

	}

}
