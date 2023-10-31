package com.overriding;



 class Company {
	
	public void adress()
	{
		System.out.println("company");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c=new Company();
		c.adress();
		
		ebay e=new ebay();
				e.adress();
	}

}
class ebay extends Company{
	

	public void adress()
	{
		System.out.println("address");
	}
	
	
}
