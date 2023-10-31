package exam;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int leap=2000;
		int cnt=0;
		
		
		if((leap%4==0 &&  leap%100!=0)||( leap%400==0))
			System.out.println("leap year");
		else
			System.out.println("not leap year");
		

	}

}
