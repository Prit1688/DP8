package exam;

public class Fiboniicseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n3;
		int n1=0;
		int n2=1;
		for(int i=2;i<20;i++)
		{
			
			n3=n1+n2;
			if(n3%5==0)
			{
				System.out.println(n3);
			}
			
			n1=n2;
			n2=n3;
			
		
		}

	}

}
