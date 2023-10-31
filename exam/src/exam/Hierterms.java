package exam;

public class Hierterms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=832;
		int n=num;
		int re=0;
		
		while(num!=0)
		{
			int rem=num%10;
			 re=re*10+rem;
			num=num/10;
		}
		re=n-re;
		{
		if(re>0)
		
			System.out.println(re);
			else
				System.out.println("0");
		

	}

}
}
