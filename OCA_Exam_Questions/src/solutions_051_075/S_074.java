package solutions_051_075;

public class S_074 {
	
	void readCard(int cardNo) throws Exception {
		System.out.println("Reading Card");
	}
	
	void checkCard(int cardNo) throws RuntimeException {
		System.out.println("Checking Card");
	}

	public static void main(String[] args) {

		S_074 ex = new S_074();
		int cardNo = 12344;
		// ex.readCard(cardNo); // Unhandled exception type Exception
		ex.checkCard(cardNo);
		
	}

}
