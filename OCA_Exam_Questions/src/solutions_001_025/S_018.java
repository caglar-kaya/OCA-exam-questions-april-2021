package solutions_001_025;

class Vehicle1 {
	String type = "4W";
	int maxSpeed = 100;
	
	Vehicle1(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
	Vehicle1() { } // Subclass default super(); runs this constructor.
}

class Car1 extends Vehicle1 {
	String trans;
	
	Car1(String trans) { // has got default super();
		this.trans = trans;
	}
	
	Car1(String type, int maxSpeed, String trans) { // has got default super();
		super(type, maxSpeed);
		this.trans = trans;
	}
}

public class S_018 {

	public static void main(String[] args) {
		
		Car1 c1 = new Car1("Auto");
		System.out.println(c1.trans); // Auto
		System.out.println(c1.type);  // 4W
		System.out.println(c1.maxSpeed); // 100
		
		Car1 c2 = new Car1("4W", 150, "Manuel");
		System.out.println(c2.trans); // Manuel
		System.out.println(c2.type);  // 4W
		System.out.println(c2.maxSpeed); // 150
		
		System.out.print(c1.type + " " + c1.maxSpeed + " " + c1.trans);
		System.out.print(c2.type + " " + c2.maxSpeed + " " + c2.trans);
		
		// Output: 4W 100 Auto4W 150 Manuel
	}

}
