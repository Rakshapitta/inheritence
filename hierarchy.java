package inheritence;

class One11 {
	public One11() {
		System.out.println("the first constractor.");
	}

	int x = 5;

	void add() {
		int a = 1, b = 2;
		System.out.println("the addition1 result is = " + (a + b));
	}
}

class Two22 extends One11 {
	public Two22() {
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

class Three33 extends One11 {
	public Three33() {
		System.out.println("the third constractor.");
	}

	int x = 15;

	void add() {
		int a = 1, b = 2;
		super.add();
		System.out.println("the addition2 result is = " + (a + b));

	}

	void show1() {
		System.out.println("the x value is = " + super.x);
		System.out.println("the x value is = " + this.x);

	}
}

public class hierarchy {
	public static void main(String[] args) {

		Two22 two = new Two22();
		two.add();
		two.show();

		Three33 thr = new Three33();
		thr.add();
		thr.show1();
	}

}
