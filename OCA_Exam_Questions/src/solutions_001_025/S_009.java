package solutions_001_025;

class CD {
	int r;
	CD(int r) {
		this.r = r;
	}
}

class DVD extends CD {
	int c;
	DVD(int r, int c) {
		super(r); // line n1
		this.c = c;
	}
}

public class S_009 {

	public static void main(String[] args) {

		DVD dvd = new DVD(10, 20);
	}

}
