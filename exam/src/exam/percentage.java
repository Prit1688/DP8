package exam;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks=95;
		if(marks<50)
		{
			System.out.println("fail");
		}
		else if(marks>=50 && marks<=60)
		{
			System.out.println("d grade");
		}
		else if(marks>=60 && marks<=70)
		{
			System.out.println("c grade");
		}
		else if(marks>=70&& marks<=80)
		{
			System.out.println("b grade");
		}
		else if(marks>=80 && marks<=100)
		{
			System.out.println("A grade");
		}
		else
		{
			System.out.println("invalid");
		}

	}

}
