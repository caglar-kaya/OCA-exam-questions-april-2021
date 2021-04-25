package solutions_126_150;

abstract class A3 {
	private static int i;
	public void doStuff() {}
	public A3() {}
}

final class A4 {
	public A4() {}
}

// Illegal modifier for the class A5; only public, abstract & final are permitted
//private class A5 {
//	
//}

// Illegal modifier for the class A5; only public, abstract & final are permitted
//protected class A5 {
//
//}

class A6 {
	protected static final int i = 10;
	private A6() {}
}

// The class A7 can be either abstract or final, not both
//final abstract class A7 {
//	
//}

public class S_134 {

	public static void main(String[] args) {
		
	}

}
