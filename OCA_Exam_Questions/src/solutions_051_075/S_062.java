package solutions_051_075;

interface Downloadable {
	public void download();
}

interface Readable2 extends Downloadable {
	public void readBook();
}

abstract class Book2 implements Readable2 {
	public void readBook() {
		System.out.println("Read Book");
	}
}

class EBook2 extends Book2 { // line n3 
	public void readBook() {
		System.out.println("Read E-Book");
	}
	
	public void download() { } // I added this line..
}

public class S_062 {

	public static void main(String[] args) {
		
		Book2 book1 = new EBook2();
		book1.readBook();
		
	}

}
