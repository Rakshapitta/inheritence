package inheritence;

class One111 {
	public One111() {
		System.out.println("the first constractor.");
	}

	int x = 5;

	void add() {
		int a = 1, b = 2;
		System.out.println("the addition1 result is = " + (a + b));
	}
}

class Two222 extends One111 {
	public Two222() {
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

	}
}

class Three333 extends Two222 {
	public Three333() {
		System.out.println("the third constractor.");
	}

	int x = 15;

	void add() {
		int a = 1, b = 2;
		super.add();
		System.out.println("the addition3 result is = " + (a + b));

	}

	void show1() {
		System.out.println("the x value is = " + super.x);

	}
}

class Four444 extends Three333 {
	public Four444() {
		System.out.println("the fourth constractor.");
	}

	int x = 20;

	void add() {
		super.add();
		int a = 1, b = 2;
		System.out.println("the addition4 result is = " + (a + b));
	}

	void show2() {
		System.out.println("the x value is = " + super.x);
		System.out.println("the x value is = " + this.x);

	}
}

class Five555 extends Three333 {
	public Five555() {
		System.out.println("the fifth constractor.");
	}

	int x = 25;

	void add() {
		int a = 1, b = 2;
		super.add();
		System.out.println("the addition5 result is = " + (a + b));

	}

	void show3() {
		System.out.println("the x value is = " + super.x);
		System.out.println("the x value is = " + this.x);

	}
}

public class hybrid {

	public static void main(String[] args) {

		Four444 two = new Four444();
		two.add();
		two.show();
		two.show1();
		two.show2();
		
		System.out.println("*************");

		Five555 fi = new Five555();
		fi.add();
		fi.show();
		fi.show1();
		fi.show3();
	}

}
