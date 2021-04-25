package solutions_101_125;

public class S_122 {

	public static void main(String[] args) {

		Short s1 = 200;
		Integer s2 = 400;
		// String s3 = (String) (s1 + s2); // Cannot cast from int to String
		Long s4 = (long) s1 + s2;
		System.out.println("Sum is " + s4);
	}

}
