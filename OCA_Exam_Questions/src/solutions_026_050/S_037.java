package solutions_026_050;

public class S_037 {

	public static void main(String[] args) {

		int data[] = {2010, 2013, 2014, 2015, 2014};
		int key = 2014;
		int count = 0;
		for (int e : data) {
			if (e != key) {
				continue;
				// count++; // Unreachable code
			}
			break;
			// count++; // Unreachable code
		}
		System.out.println(count + " Found");
	}

	// Answer : A. Compilation fails
}
