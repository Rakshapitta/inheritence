package inheritence;

interface I1 {
	int x = 10;

	void add(int a, int b);
}

interface I2 {
	int y = 20;

	void sub(int a, int b);
}

class Use_Interface implements I1, I2 {
	public void add(int a, int b) {
		System.out.println("the addition result is = " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("the subtration result is = " + (a - b));

	}

}

public class Multiple {
	public static void main(String[] args) {
		Use_Interface obj = new Use_Interface();
		obj.add(10, 20);
		obj.sub(10, 5);
	}

}
