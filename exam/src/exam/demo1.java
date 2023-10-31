package exam;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=24;
		int sum=0;
		int d=num;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		if(d%sum==0)
		System.out.println("har");
		else
			System.out.println("not");
		
		
		

	}

}
