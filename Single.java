package inheritence;

class One {
	public One() {
		System.out.println("the first constractor.");
	}

	int x = 5;

	void add() {
		int a = 1, b = 2;
		System.out.println("the addition1 result is = " + (a + b));
	}
}

class Two extends One{
	public Two() {
		System.out.println("the second constractor.");
	}
	int x = 10;

	void add() {
		int a = 1, b = 2;
		super.add();
		System.out.println("the addition2 result is = " + (a + b));
		
	}
	void show() {
		System.out.println("the x value is = " + super.x);
		System.out.println("the x value is = " + this.x);
		
	}
}

public class Single {
	public static void main(String[] args) {
		Two two=new Two();
		two.add();
		two.show();
	}

}
