package solutions_001_025;

public class S_002 {

	public static void main(String[] args) {

		int i = 10;
		int j = 20;
		int k = (j += i) / 5;
		System.out.println(i + " : " + j + " : " + k);
		
		// Output: 10 : 30 : 6
	}

}
