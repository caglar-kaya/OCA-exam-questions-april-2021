package solutions_076_100;

class A2 {
	public void test() {
		System.out.println("A ");
	}
}

class B2 extends A2 {
	public void test() {
		System.out.println("B ");
	}
}

class C2 extends A2 {
	public void test() {
		System.out.println("C ");
	}
}

public class S_086 {

	public static void main(String[] args) {
		A2 b1 = new A2();
		A2 b2 = new C2();
		// B2 b4 = new C2(); // Type mismatch: cannot convert from C2 to B2
		//A2 b3 = (B2) b2; // C2 can not be cast to B2 : Exception at runtime.
		b1 = (A2) b2;
		b1.test();
		// b3.test();
	}

}
