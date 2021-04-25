package solutions_001_025;

class Test2 {
	int a1;
	
	public static void doProduct(int a) {
		a = a * a;
	}
	
	public static void doString(String s) {
		s.concat(" " + s);
	}
}

public class S_020 {

	public static void main(String[] args) {
		Test2 item = new Test2();
		item.a1 = 11;
		String sb = "Hello";
		Integer i = 10;
		Test2.doProduct(i);
		Test2.doString(sb);
		Test2.doProduct(item.a1);
		System.out.println(i + " " + sb + " " + item.a1);
	}

}
