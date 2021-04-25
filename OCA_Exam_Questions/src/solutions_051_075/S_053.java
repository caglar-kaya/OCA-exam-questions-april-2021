package solutions_051_075;

public class S_053 {

	public static void main(String[] args) {

		int num[][] = new int[1][3];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = 150;
				System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
			}
		}
	}

}
