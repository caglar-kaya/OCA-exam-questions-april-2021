package solutions_001_025;

public class S_022 {
	public static void main(String[] args) {
		int ans;
		try {
			int num = 10;
			int div = 0;
			ans = num / div;
		} catch (ArithmeticException ae) {
			ans = 0; // local assignment		  // line n1
		} catch (Exception e) {
			System.out.println("Invalid calculation");
		}
		// System.out.println("Answer = " + ans); // line n2
		// The local variable ans may not have been initialized
	}

}
