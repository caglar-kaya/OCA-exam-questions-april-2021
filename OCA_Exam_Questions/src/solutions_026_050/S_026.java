package solutions_026_050;

class FieldInit {
	Character a;	// null
	char c;			// space
	boolean b;		// false
	float f;		// 0.0
	void printAll() {
		System.out.println("a = " + a);
		System.out.println("c = " + "." + c + ".");
		System.out.println("b = " + b);
		System.out.println("f = " + f);
	}
}

public class S_026 {

	public static void main(String[] args) {
		FieldInit f = new FieldInit();
		f.printAll();
		
	}

}
