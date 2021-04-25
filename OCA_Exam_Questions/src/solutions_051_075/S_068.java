package solutions_051_075;

import java.io.IOException;

class MyException extends RuntimeException { }

public class S_068 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (MyException ne) {
			System.out.println("A");
		}
	}
	public static void method1() { // line n1
		try {
			throw 3 > 10 ? new MyException() : new IOException();
		} catch (IOException ie) {
			System.out.println("I");
		} catch (Exception re) {
			System.out.println("B");
		}
	}

}

//  