package solutions_026_050;

class X3 {
	int i;
	static int j;
}

public class S_032 {

	public static void main(String[] args) {

		X3 x1 = new X3();
		X3 x2 = new X3();
		x1.i = 3;
		x1.j = 4;
		x2.i = 5;
		x2.j = 6;
		System.out.print(
				x1.i + " " +
				x1.j + " " +
				x2.i + " " +
				x2.j);
	}

}
