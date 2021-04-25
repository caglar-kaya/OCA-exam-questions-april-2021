package solutions_126_150;

class Vehicle {
	int x;
	Vehicle() {
		this(10); // line n1
	}
	Vehicle(int x) {
		this.x = x;
	}
}

class Car extends Vehicle {
	int y;
	Car() {
		super();
		// this(20); // line n2
		// we can NOT call both super() and this() in the same constructor
	}
	Car(int y) {
		this.y = y;
	}
}

public class S_131 {

	public static void main(String[] args) {

		
	}

}
