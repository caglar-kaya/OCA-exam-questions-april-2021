package solutions_051_075;

public class S_070 {

	public static void main(String[] args) {

		int x = 10;
		int y = ++x;
		int z = 0;
		if (y >= 10 | y <= ++x) { // || was here -> y <= ++x doesn't run.
			z = x;
		} else {
			z = x++;
		}
		System.out.println(z);
	}

}
