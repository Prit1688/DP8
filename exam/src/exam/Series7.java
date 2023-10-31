package exam;

public class Series7 {
	
	public void terms(int  num)
	{
		
		System.out.println(num);
		
		for(int i=1;i<=10;i++)
		{
			int h=num+(i*4);
			num=h;
			System.out.println(h);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Series7 obj=new Series7();
		obj.terms(5);
		

	}

}
