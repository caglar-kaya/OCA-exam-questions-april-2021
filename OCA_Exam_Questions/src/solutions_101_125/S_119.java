package solutions_101_125;

class App2 {
	String greet = "Welcome!";
	public App2() {
		String greet = "Hello!";
	}
	public void setGreet() {
		String greet = "Good Day!";
	}
}

public class S_119 {

	public static void main(String[] args) {
		App2 t = new App2();
		String greet = "Good Luck!";
		System.out.println(t.greet); // Welcome!
		t.setGreet();
		System.out.println(t.greet); // Welcome!
	}

}
