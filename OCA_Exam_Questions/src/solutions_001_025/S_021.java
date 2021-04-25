package solutions_001_025;

class Vehicle2 {
	Vehicle2() {
		System.out.println("Vehicle");
	}
}

class Bus extends Vehicle2 {
	Bus() {
		System.out.println("Bus");
	}
}

public class S_021 {

	public static void main(String[] args) {
		
		Vehicle2 v = new Bus();
		
	}

}
