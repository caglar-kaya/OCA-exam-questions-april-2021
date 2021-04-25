package solutions_051_075;

class Caller {
	private void init() {
		System.out.println("Initialized");
	}
	private void start() {
		init();
		System.out.println("Started");
	}
}

public class S_067 {

	public static void main(String[] args) {
		Caller c = new Caller();
		// c.init();	// The method init() from the type Caller is not visible
		// c.start();	// The method start() from the type Caller is not visible
	}

}
