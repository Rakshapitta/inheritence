package inheritence;

class First {
	First() {
		System.out.println("this is aconstructor.....");
	}

	int a = 10;

	void add(int a, int b) {
		System.out.println("the addition result is = " + (a + b));
	}
}

interface I3 {
	int x = 20;

	void sub(int a, int b);
}

public class Multiple1 extends First implements I3 {

	public void sub(int a, int b) {
		System.out.println("the subtraction result is = ");

	}

	public static void main(String[] args) {
		First fi = new First();
		System.out.println("the a value is = " + fi.a);
		fi.add(10, 20);
		Multiple1 mp = new Multiple1();
		mp.sub(20, 10);

	}

}
