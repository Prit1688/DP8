package exam;

public class litebill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int units=500;
	int bill=0;
		 
	if(units<100)
	bill=units*5;
	 else if(units<300)
	bill=units*5+(units-100)*8;
	else if(units>300)
	bill=100*5+200*8+(units-300)*10;
	System.out.println(bill);
	
	}

}
