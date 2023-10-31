package exam;

public class Returnobject {
	
	int dd,mm,yy;
	
	public Returnobject(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
		System.out.println(dd+" "+mm+" "+yy+" ");
	}
	
	public void Setd(int d)
	{
		dd=d;
	}
	public void Setm(int m)
	{
		mm=m;
	}
	public void Sety(int y)
		{
		yy=y;
		}
	public int getm()
	{
		return dd;
	}
	public int getd()
	{
		return mm;
	}
	public int gety()
	{
		return yy;
	}
	public void display()
	{
		System.out.println("date is"+" "+dd+" "+mm+" "+yy);
	}
	public Returnobject getObject()
	{
		return new Returnobject(19,10,2023);
		
	}
	

	public static void main(String[] args) {
		
		Returnobject obj=new Returnobject(12,10,2023);
		obj.Setd(23);
		obj.Setm(06);
		obj.Sety(2023);
		obj.display();
		Returnobject obbj1=obj.getObject();//how to return object
		obbj1.display();
		
		

	}

}
