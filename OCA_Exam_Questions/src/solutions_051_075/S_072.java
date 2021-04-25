package solutions_051_075;

public class S_072 {

	public static void main(String[] args) {
		S_072 test = new S_072();
		S_072 test2 = new S_072();
		S_072 test3 = new S_072();
		System.out.print(isAvailable + " ");
		isAvailable = test.doStuff();
		System.out.println(isAvailable);
		
		System.out.println(test2.x); // 5
		System.out.println(x); // 5 
		System.out.println(test.x); // 5
		x = 6;
		System.out.println(x); // 6
		
		test.x = 7;
		System.out.println(x); // 7
		
		System.out.println(test2.x); // 7
		
		System.out.println(test3.x); // 7
	}
	public static boolean doStuff() {
		return !isAvailable;
	}
	static boolean isAvailable = false;
	
	static int x = 5;
}
