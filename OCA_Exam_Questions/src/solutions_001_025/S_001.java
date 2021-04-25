package solutions_001_025;

public class S_001 {

	public static void main(String[] args) {

		int x = 1;
		int y = 1;
		if (x++ < ++y) {
			System.out.print("Hello ");
		} else {
			System.out.print("Welcome ");
		}
		System.out.print("Log " + x + ":" + y);
		// Output: Hello Log 2:2
	}

}
