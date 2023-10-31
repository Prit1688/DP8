package exam;

public class Evenodd {
	
	public int evenodd (int num){
		
		
	
		if(num%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		return num;
		
		
	}

	public static void main(String[] args) {
		
			
		Evenodd  sc=new Evenodd ();
		int res=sc.evenodd(5);
		System.out.println(res);
		// TODO Auto-generated method stub

	}

}
