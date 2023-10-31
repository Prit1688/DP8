package exam;

public class Shadow {
	
	int dd;
	int mm;
	int yy;
	
	public void setdata(int dd,int mm,int yy)
	{
	this.mm=mm;
	this.dd=dd;
	this.yy=yy;
	
	
		 
	}
	public void display()
	{
		System.out.println(mm+" "+dd+" "+yy);
	}

	public static void main(String[] args) {
		
		Shadow obj=new Shadow();
		obj.setdata(12,34,45);
		obj.display();

	}

}
