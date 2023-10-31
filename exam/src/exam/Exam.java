package exam;

public class Exam {

	private int dd, mm, yy;

	public Exam() {
	
		dd=23;
		mm=04;
		yy=2035;
		System.out.println("i am deafult constructor"+ dd+" " + mm +  yy);
		
	}

	public Exam(int d, int m, int y) {
		
		
		dd = d;
		mm = m;
		yy = y;
		System.out.println("This is parameterized constructor"+ dd+" " + mm + yy);

	}

	public void setdata(int d, int m, int y)//set method
	{
		dd = d;
		mm = m;
		yy = y;

	}

	public void Setdd(int d) {
		dd = d;
	}

	public void Setmm(int m) {
		mm = m;
	}

	public void Setyy(int y) {
		yy = y;
	}

	public int getdd() {
		return dd;
	}

	public int getmm() {
		return mm;
	}

	public int getyy() {
		return yy;
	}

	public void display() {

		System.out.println("date is " + dd + " " + mm + " " + yy);
	}
	public void add(Exam obj1)
	{
		
		int d=this.dd+obj1.dd;
		System.out.println(d);
	}
	
	

	public static void main(String[] args) {
		Exam obj = new Exam();//calling default constructor
		
		
		Exam obj1=new Exam(10,12,2023);//calling Parameterized constructor
		
		
		obj.Setmm(04);
		obj.Setyy(2023);
		obj.Setdd(21);
		obj.display();
		
		obj.add(obj1);
		
		
		
		

	}

}
