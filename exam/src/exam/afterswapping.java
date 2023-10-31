package exam;

public class afterswapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;
		int y=4;
		
		
		System.out.println("before swapping");
		System.out.println(x);
		System.out.println(y);
		
	
		
		 x=x+y;
		y=x-y;
		x=x-y;
		
		
		System.out.println("after swapping");
		System.out.println(x);
		System.out.println(y);
		
		

	}

}
