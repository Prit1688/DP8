package com.inheritance;

 class Covarient {

	public Covarient getCovarient()
	{
		return new Covarient();
	}

}
 class Manager1 extends Covarient
 {
	 
	 public Manager1 getManager()
	 {
		 return new Manager1();
	 }
 }

