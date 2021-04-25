package solutions_051_075;

interface Readable {
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable { // line n1
	public void readBook() { }
	// line n2
}

class EBook extends Book {
	public void setBookMark() { }

}

public class S_060 {

	public static void main(String[] args) {

		
	}

}
