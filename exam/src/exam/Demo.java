package exam;

public class Demo {
	
	public int Calculatefact(int num){
		
		
		int fact=1;
		for(int i=1;i<=6;i++)
		{
		 fact=fact*i;
		}
		return fact;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo sa=new Demo();
		int res=sa.Calculatefact(5);
		System.out.println(res);
		
		
	}

}

