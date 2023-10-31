package exam;

public class Account {

	 private int Accno;
	private String OwenrName;
	private double Balance;
	
	public Account()
	{
		
		Accno=34;
		OwenrName="prit";
		Balance=30000;	
		System.out.println("i am deafult cons"+Accno+OwenrName+Balance);
	}
	public Account(int Acno,String owernme,double balance )
	
	{
		Accno=Acno;
		OwenrName=owernme;
		Balance=balance;
		System.out.println("i am para cons"+Accno+OwenrName+Balance);
		
		
		
	}

	public void setAccno(int an)
	{
		Accno=an;
	}
	public void SetOwenrName(String on)
	{
		OwenrName=on;
	}
	public void setbs(double balance)
	{
		Balance=balance;
	}
	public int getaccno()
	{
		return Accno;
	}
	public String getwenrname()
	{
		return OwenrName;
	}
	public double balance()
	{
		return Balance ;
	}
	
	public void display()
	{
		System.out.println("acc deatils"+"Account number="+Accno+" "+OwenrName+" "+Balance);
		
	}
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj=new Account();// deafault constructor 
		Account obj1=new Account(12,"prit",87.97);// parimeterized constructor
		obj.setAccno(76);
		obj.SetOwenrName("prit");
		obj.setbs(20.000);
		obj.display();
		
		
		
	}

}
