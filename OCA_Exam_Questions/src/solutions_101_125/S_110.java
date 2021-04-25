package solutions_101_125;

class Base2 {
	public void test() {
		System.out.println("Base ");
	}
}

class DerivedA2 extends Base2 {
	public void test() {
		System.out.println("DerivedA ");
	}
}

class DerivedB2 extends DerivedA2 {
	public void test() {
		System.out.println("DerivedB ");
	}
}
public class S_110 {

	public static void main(String[] args) {
		Base2 b1 = new DerivedB2();
		Base2 b2 = new DerivedA2();
		Base2 b3 = new DerivedB2();
		b1 = (Base2) b3;
		Base2 b4 = (DerivedA2) b3;
		b1.test();
		b4.test();
	}

}
