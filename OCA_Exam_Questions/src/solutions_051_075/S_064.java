package solutions_051_075;

class Mystring {
	String msg;
	Mystring(String msg) {
		this.msg = msg;
	}
}

public class S_064 {
	public static void main(String[] args) {
		System.out.println("Hello " + new StringBuilder("Java SE 8"));
		System.out.println("Hello " + new Mystring("Java SE 8"));
		System.out.println("Hello " + new Mystring("Java SE 8").msg);
	}

}
