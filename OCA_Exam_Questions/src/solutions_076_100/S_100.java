package solutions_076_100;

import solutions_051_075.S_075;

public class S_100 extends S_075 { 

	public static void main(String[] args) {
		
		S_100 obj = new S_100(); // Reference is S_100 (Subclass)
		
		// obj.q = 3; // private    // The field S_075.q is not visible
		// obj.p = 5; // default    // The field S_075.q is not visible
		obj.r = 7; 	  // protected
		obj.s = 5;    // public
		
		
		S_075 obj2 = new S_100(); // Reference is S_075 (Superclass)
		
		// obj2.q = 3; // private    // The field S_075.q is not visible
		// obj2.p = 5; // default    // The field S_075.q is not visible
		// obj2.r = 7; // protected  // The field S_075.q is not visible
		obj2.s = 5;    // public
		
		
	}

}
