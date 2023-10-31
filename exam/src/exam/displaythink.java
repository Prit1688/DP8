package exam;

public class displaythink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=50;i++)
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println("thinkqueotient ="+i);
			}
			else if(i%3==0)
			{
				System.out.println("think ="+i);
			}
			else if(i%5==0)
			{
				System.out.println("qutioent ="+i);
			}
			else
				System.out.println(i);
		}
		

	}

}
