package solutions_076_100;

public class S_077 {

	public static void main(String[] args) {

		int[] intArr = {8, 16, 32, 64, 128};
		
		for (int i = 3; i < 8; i++) {
			System.out.print((int) Math.pow(2, i) + " ");
		}
		
		System.out.println();
		
		for (int i : intArr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
	}

}
