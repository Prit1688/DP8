package exam;

public class Adder {

	public void add(int i, int j) {

		System.out.println((i * j));
	}

	public void add(int a, int b, int c) {
		System.out.println((a + b + c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder obj = new Adder();
		obj.add(11, 12);
		obj.add(1, 20, 30);
	}

}
