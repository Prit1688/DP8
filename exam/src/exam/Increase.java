package exam;

public class Increase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=54689;
		int lastdigit=num;
		int cnt=0;
		
		
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
			
		
		if(rem>lastdigit)
			cnt++;
		lastdigit=rem;

	}
		if(cnt==0)
		{
			System.out.println("increse");
			
		}
		else
			System.out.println("decre");

}
}
