package inheritence;

abstract class Ex_1 {
	int a;
	int b = 10;

	public Ex_1() {
		System.out.println("this is a abstract class constructor.");
	}

	void add() {
		System.out.println("the addition result is = " + (1 + 2));
	}

	abstract int sub(int a, int b);

	abstract int mul(int c, int d);
}

class Ex_2 extends Ex_1 {
	int c = 20;

	void add() {
		super.add();
		System.out.println("the addition result is = " + (3 + 4));
	}

	int sub(int a, int b) {
		return (a - b);
	}

	int mul(int c, int d) {
		return c * d;
	}

}

class Ex_3 extends Ex_1 {
	int c = 20;

	void add() {
		System.out.println(5 + 6);
	}

	int sub(int a, int b) {
		return (a - b);
	}

	int mul(int c, int d) {
		return c * d;
	}

}

public class AbstractClass {
	public static void main(String[] args) {

		Ex_2 obj = new Ex_2();
		obj.add();
		System.out.println("the subtraction result is = " + (obj.sub(5, 10)));
		System.out.println("the multiplication result is = " + (obj.mul(15, 20)));
		
		System.out.println("===============================================");

		Ex_3 obj1 = new Ex_3();
		obj.add();
		System.out.println("the subtraction result is = " + (obj.sub(15, 20)));
		System.out.println("the multiplication result is = " + (obj.mul(25, 30)));

	}

}
