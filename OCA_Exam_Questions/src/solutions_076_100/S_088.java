package solutions_076_100;

public class S_088 {

	public static void main(String[] args) {
		int x = 6;
		while (isAvailable(x)) {
			System.out.print(--x);
		}
	}
	
	public static boolean isAvailable(int x) {
		return --x > 0 ? true : false;
	}

}
