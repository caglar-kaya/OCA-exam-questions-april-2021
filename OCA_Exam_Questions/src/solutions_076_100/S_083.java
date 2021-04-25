package solutions_076_100;

public class S_083 {
	public static void main(String[] args) {
		S_083 ts = new S_083();
		System.out.print(isAvailable + " ");
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
 	}
	public static boolean doStuff() {
		return !isAvailable;
	}
	static boolean isAvailable = true;

}
