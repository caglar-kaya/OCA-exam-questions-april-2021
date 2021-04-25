package solutions_101_125;

class App {
	int count;
	public static void displayMsg() {
		// count++; // Cannot make a static reference to the non-static field count
		// System.out.println("Welcome " + "Visit Count: " + count);
	}
}

public class S_112 {

	public static void main(String[] args) {
		App.displayMsg();
		App.displayMsg();
	}

}
