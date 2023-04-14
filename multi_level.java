package inheritence;

class One1 {
	public One1() {
		System.out.println("the first constractor.");
	}

	int x = 5;

	void add() {
		int a = 1, b = 2;
		System.out.println("the addition1 result is = " + (a + b));
	}
}

class Two2 extends One{
	public Two2() {
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
class Three3 extends Two2 {
	public Three3() {
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
		System.out.println("the x value is = " + this.x);
		
	}
}



public class multi_level {
	public static void main(String[] args) {
		Three3 thr=new Three3();
		thr.add();
		thr.show();
		thr.show1();
		
	}

}
