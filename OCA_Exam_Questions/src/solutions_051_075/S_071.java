package solutions_051_075;

class C22 {
	public void displayC2() {
		System.out.println("C2");
	}
}

interface I2 {
	public void displayI();
}
class C12 extends C22 implements I2 {
	public void displayI() {
		System.out.println("C1");
	}
}

public class S_071 {

	public static void main(String[] args) {

		C22 obj1 = new C12();
		I2 obj2 = new C12();
		
		// C22 s = obj2; // Correct Casting : C22 s = (C22) obj2;
		// I2 t = (I2) obj1; // I2 t = (I2) obj1;
		
	}

}
