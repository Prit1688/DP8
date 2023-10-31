package exam;

public class NationalGame {
	
	String countryname;
	
	
	public void setData(String cn)
	{
		countryname=cn;
	}
	
	public void Display()
	{
		switch(countryname)
		{
		case "india" :System .out.println("national game of india cricket");
		break;
		case "china": System.out.println("national game if china hallball");
		break;
		default: System.out.println("invalid");
		
		
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NationalGame obj=new NationalGame();
		obj.setData("india");
		obj.Display();
		
		

	}

}
