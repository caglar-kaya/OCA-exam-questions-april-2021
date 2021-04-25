package solutions_076_100;

class C {
	public C() {
		System.out.print("C ");
	}
}

class B extends C {
	public B() {
		System.out.print("B ");
	}
}

class A extends B {
	public A() {
		System.out.print("A ");
	}
}

public class S_079 {

	public static void main(String[] args) {

		A a = new A();
	}

}
